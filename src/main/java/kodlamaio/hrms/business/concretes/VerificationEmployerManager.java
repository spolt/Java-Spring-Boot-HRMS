package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.VerificationEmployerService;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.VerificationEmployerDao;
import kodlamaio.hrms.entities.concretes.VerificationEmployer;

@Service
public class VerificationEmployerManager implements VerificationEmployerService{

	private VerificationEmployerDao verificationEmployerDao;
	
	
	
	@Autowired
	public VerificationEmployerManager(VerificationEmployerDao verificationEmployerDao) {
		super();
		this.verificationEmployerDao = verificationEmployerDao;
	}




	@Override
	public Result add(VerificationEmployer code) {
		this.verificationEmployerDao.save(code);
		return new SuccessResult("Code saved.");
	}

}
