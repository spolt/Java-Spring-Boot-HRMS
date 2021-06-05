package kodlamaio.hrms.business.abstracts;



import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.Employer;


public interface AuthService {
	
	Result registerEmployer(Employer employer);
	
	Result registerCandidate(Candidate candidate);

	boolean checkIfRealCompany(String companyName, String website, String phone);

}
