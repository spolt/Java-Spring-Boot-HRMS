package kodlamaio.hrms.business.abstracts;



import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

public interface JobAdvertService {
	
	Result add(JobAdvert jobAdvert);
	
	DataResult<JobAdvert> getById(int id);
	
	DataResult<List<JobAdvert>> getAll();
	
	DataResult<List<JobAdvert>> findAllOpenJobAdvertList();
	
	DataResult<List<JobAdvert>> getAllByOrderByPublishedDate();
	
	DataResult<List<JobAdvert>> getByIsOpenAndEmployerId(boolean isOpen, int id);

}
