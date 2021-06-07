package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;

public interface CurriculumVitaeService {
	
	Result add(CurriculumVitae curriculumVitae);
	
	DataResult<List<CurriculumVitae>> getAll();
	
	DataResult<List<CandidateCvDto>> getByIdCandidateWithExperiences(int id);
}
