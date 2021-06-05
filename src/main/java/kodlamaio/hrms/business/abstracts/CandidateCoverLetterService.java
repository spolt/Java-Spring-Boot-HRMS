package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateCoverLetter;

public interface CandidateCoverLetterService {

	Result add(CandidateCoverLetter candidateCoverLetter);
	Result update(CandidateCoverLetter candidateCoverLetter);
	
	DataResult<List<CandidateCoverLetter>> getAll();
}
