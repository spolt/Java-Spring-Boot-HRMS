package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvert;

@RestController
@RequestMapping("/api/jobadverts")
public class JobAdvertsController {

	
	private JobAdvertService jobAdvertService;
	
	@Autowired
	public JobAdvertsController(JobAdvertService jobAdvertService) {
		super();
		this.jobAdvertService = jobAdvertService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvert jobAdvert) {
		
		return this.jobAdvertService.add(jobAdvert);
	}
	
	@GetMapping("/getbyid")
	public DataResult<JobAdvert> getById(@RequestParam int id) {
		
		return this.jobAdvertService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvert>> getAll() {
		return this.jobAdvertService.getAll();
	}
	
	@GetMapping("findallopenjobadvertslist")
	public DataResult<List<JobAdvert>> findAllOpenJobAdvertList() {
		return this.jobAdvertService.findAllOpenJobAdvertList();
	}
	
	@GetMapping("/getallByOrderByPublishedDate")
	public DataResult<List<JobAdvert>> getAllByOrderByPublishedDate() {
		return this.jobAdvertService.getAllByOrderByPublishedDate();
	}
	
	@GetMapping("/getByIsOpenAndEmployerId")
	public DataResult<List<JobAdvert>> getByIsOpenAndEmployerId(@RequestParam boolean isOpen, int id){
		return this.jobAdvertService.getByIsOpenAndEmployerId(isOpen,id);
	}	
	
	
	
}
