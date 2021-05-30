package kodlamaio.hrms.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertDao;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService{

	private JobAdvertDao jobAdvertDao;
	
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		super();
		this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvert jobAdvert) {
		this.jobAdvertDao.save(jobAdvert);
		return new SuccessResult("Job advert is added");
	}

	@Override
	public DataResult<JobAdvert> getById(int id) {
		
		return new SuccessDataResult<JobAdvert>(this.jobAdvertDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvert>> getAll() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(), "İş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvert>> findAllOpenJobAdvertList() {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getAllOpenJobAdvertList());
	}

	@Override
	public DataResult<List<JobAdvert>> getAllByOrderByPublishedDate() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "publishedDate");
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.findAll(sort));
	}

	@Override
	public DataResult<List<JobAdvert>> getByIsOpenAndEmployerId(boolean isOpen, int id) {
		
		return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertDao.getByIsOpenAndEmployerId(isOpen, id));
	}

}

