package kodlamaio.hrms.mernis;



import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.services.MernisCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class MernisFake implements MernisCheckService{

	@Override
	public boolean isMernis(JobSeeker jobSeeker) {
		
		return jobSeeker.getTcno().length() == 11;
	
	}
	
}