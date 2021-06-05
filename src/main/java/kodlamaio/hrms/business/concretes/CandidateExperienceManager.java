package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateExperienceDao;
import kodlamaio.hrms.entities.concretes.CandidateExperience;

@Service
public class CandidateExperienceManager implements CandidateExperienceService{
	
	private CandidateExperienceDao candidateExperienceDao;
	
	
	@Autowired
	public CandidateExperienceManager(CandidateExperienceDao candidateExperienceDao) {
		super();
		this.candidateExperienceDao = candidateExperienceDao;
	}

	@Override
	public Result add(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		return new SuccessResult("Candidate experience is saved");
	}

	@Override
	public Result update(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		return new SuccessResult("Candidate experience is updated");
	}

	@Override
	public DataResult<List<CandidateExperience>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"finishDate");
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.findAll(sort));
	}

	@Override
	public DataResult<List<CandidateExperience>> getAllByCandidateIdOrderByFinishDate(int candidateId) {
		
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.getAllByCandidateIdOrderByFinishDate(candidateId));
	}

}
