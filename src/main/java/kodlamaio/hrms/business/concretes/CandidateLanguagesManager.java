package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateLanguagesService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateLanguagesDao;
import kodlamaio.hrms.entities.concretes.CandidateLanguages;

@Service
public class CandidateLanguagesManager implements CandidateLanguagesService{
	
	private CandidateLanguagesDao candidateLanguagesDao;
	
	
	@Autowired
	public CandidateLanguagesManager(CandidateLanguagesDao candidateLanguagesDao) {
		super();
		this.candidateLanguagesDao = candidateLanguagesDao;
	}

	@Override
	public Result add(CandidateLanguages candidateLanguages) {
		this.candidateLanguagesDao.save(candidateLanguages);
		return new SuccessResult("Operation succesful");
	}

	@Override
	public Result update(CandidateLanguages candidateLanguages) {
		this.candidateLanguagesDao.save(candidateLanguages);
		return new SuccessResult("Operation succesful");
	}

	@Override
	public DataResult<List<CandidateLanguages>> getAll() {
		return new SuccessDataResult<List<CandidateLanguages>>(this.candidateLanguagesDao.findAll());
	}

}
