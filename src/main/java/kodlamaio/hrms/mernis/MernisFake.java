package kodlamaio.hrms.mernis;



import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.services.MernisCheckService;
import kodlamaio.hrms.entities.concretes.Candidate;

@Service
public class MernisFake implements MernisCheckService{

	@Override
	public boolean isMernis(Candidate candidate) {
		
		return candidate.getTcno().length() == 11;
	
	}
	
}