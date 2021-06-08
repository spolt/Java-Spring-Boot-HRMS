package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.AuthService;
import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.business.abstracts.VerificationEmployerService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.utilities.services.MernisCheckService;
import kodlamaio.hrms.core.verifications.VerificationGeneratorService;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.VerificationEmployer;


@Service
public class AuthManager implements AuthService{
	
	private UserService userService;
	private EmployerService employerService;
	private CandidateService candidateService;
	private VerificationEmployerService verificationEmployerService;
	private VerificationGeneratorService verificationGeneratorService;
	private final MernisCheckService mernisCheckService;
	private String confirmPassword = "123465";
	
	
	@Autowired
	public AuthManager(UserService userService, EmployerService employerService, CandidateService candidateService,
			MernisCheckService mernisCheckService, VerificationEmployerService verificationEmployerService,VerificationGeneratorService verificationGeneratorService) {
		super();
		this.employerService = employerService;
		this.candidateService = candidateService;
		this.mernisCheckService = mernisCheckService;
		this.verificationEmployerService = verificationEmployerService;
		this.verificationGeneratorService = verificationGeneratorService;
		this.userService = userService;
	}

	@Override
	public Result registerEmployer(Employer employer) {
		
		if (checkIfRealCompany(employer.getCompanyName(), employer.getWebsite(), employer.getPhone()) == false) {
			
			return new ErrorResult("Employer is not valid");
		}
		if (!checkIfEqualEmailAndDomain(employer.getEmail(), employer.getWebsite())) {
			
			return new ErrorResult("Domain is not valid");
		}
		if (!checkIfEmailExist(employer.getEmail())) {
			
			return new ErrorResult("Email address is already in database.");
		}
		if (!checkIfEqualPasswordAndConfirmPassword(employer.getPassword(), confirmPassword)) {
			
			return new ErrorResult("passwords not match");
		}
		
		
		employerService.addEmployer(employer);
		String code = verificationGeneratorService.sendCode();
		verificationCodeIsGenerated(code, employer.getId(), employer.getEmail());
		return new SuccessResult("Employer " + employer.getCompanyName() + " is added");
	}
	
	

	@Override
	public Result registerCandidate(Candidate candidate) {
		
		if(checkIfNullValueInCandidates(candidate)) {
			
			return new ErrorResult("There is/are some empty space/s in the form");
			
		}
		
		if (!checkIfExistNationalId(candidate.getTcno())) {
			
			return new ErrorResult("There is a national ID error");
		}
		
		if (!checkIfEmailExist(candidate.getEmail())) {
			
			return new ErrorResult("There is an email error.");
		}
		if (!mernisCheckService.isMernis(candidate)) {
			
			return new ErrorResult("Error: Mernis failed");
		}
		if (!checkIfEqualPasswordAndConfirmPassword(candidate.getPassword(), confirmPassword)) {
			
			return new ErrorResult("passwords not match");
		}
		
		candidateService.addCandidate(candidate);
		return new SuccessResult("Candidate " + candidate.getFirstName() + candidate.getLastName() + " registration completed.");
	}
	
	
	
	
	
	
	private boolean checkIfExistNationalId(String tcno) {
		return true;
	}

	private boolean checkIfNullValueInCandidates(Candidate candidate) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean checkIfEqualPasswordAndConfirmPassword(String password, String confirmPassword) {
		if (!password.equals(confirmPassword)) {
			return false;
		}
		return true;
	}

	private boolean checkIfEmailExist(String email) {
		if (this.userService.getUserByEmail(email).getData() == null) {
			return true;
		}
		return false;
	}

	private boolean checkIfEqualEmailAndDomain(String email, String website) {
		String[] emailArr = email.split("@", 2);
		String domain = website.substring(4,website.length());
		
		if(emailArr[1].equals(domain)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean checkIfRealCompany(String companyName, String website, String phone) {
		// TODO Auto-generated method stub
		return true;
	}
	
	private void verificationCodeIsGenerated(String code, int id, String email) {
		VerificationEmployer verificationEmployer = new VerificationEmployer(id,null, false, code, id);
		this.verificationEmployerService.add(verificationEmployer);
		System.out.println("verification code sent: " + email);
	}
	
	


}
