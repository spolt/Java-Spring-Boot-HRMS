package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateCoverLetterDao;
import kodlamaio.hrms.entities.concretes.CandidateCoverLetter;

@Service
public class CandidateCoverLetterManager implements CandidateCoverLetterService{
	
	private CandidateCoverLetterDao candidateCoverLetterDao;
	
	
	@Autowired
	public CandidateCoverLetterManager(CandidateCoverLetterDao candidateCoverLetterDao) {
		super();
		this.candidateCoverLetterDao = candidateCoverLetterDao;
	}

	@Override
	public Result add(CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.save(candidateCoverLetter);
		return new SuccessResult("Candidate cover letter is added.");
	}

	@Override
	public Result update(CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.save(candidateCoverLetter);
		return new SuccessResult("Candidate cover letter is updated");
	}

	@Override
	public DataResult<List<CandidateCoverLetter>> getAll() {
		
		return new SuccessDataResult<List<CandidateCoverLetter>>(this.candidateCoverLetterDao.findAll());
	}

}
