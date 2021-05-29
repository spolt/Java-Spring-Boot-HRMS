package kodlamaio.hrms.business.abstracts;



import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Employer;
import kodlamaio.hrms.entities.concretes.JobSeeker;


public interface AuthService {
	
	Result registerEmployer(Employer employer);
	
	Result registerJobseeker(JobSeeker jobSeeker);

	boolean checkIfRealCompany(String companyName, String website, String phone);

}
