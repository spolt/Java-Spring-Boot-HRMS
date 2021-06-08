package kodlamaio.hrms.core.verifications;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class VerificationGeneratorManager implements VerificationGeneratorService{

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://verificationtest/" + uuid.toString();
		System.out.println("Verification Code has been send:" + email);
		System.out.println("Please verify your account from this link: " + verificationLink);
		
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Activation code: " + verificationCode);
		return verificationCode;
	}

}
