package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateExperience;

public interface CandidateExperienceService {
	
	Result add(CandidateExperience candidateExperience);
	Result update(CandidateExperience candidateExperience);
	
	DataResult<List<CandidateExperience>> getAllSorted();
	DataResult<List<CandidateExperience>> getAllByCandidateIdOrderByFinishDate(int candidateId);

}
