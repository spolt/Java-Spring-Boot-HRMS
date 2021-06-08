package kodlamaio.hrms.core.verifications;

public interface VerificationGeneratorService {
	
	void sendLink(String email);
	
	String sendCode();

}
