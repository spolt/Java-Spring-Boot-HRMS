package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateEducation;

@RestController
@RequestMapping("/api/candidateeducations")
public class CandidateEducationsController {
	
	private CandidateEducationService candidateEducationService;
	
	@Autowired
	public CandidateEducationsController(CandidateEducationService candidateEducationService) {
		super();
		this.candidateEducationService = candidateEducationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateEducation candidateEducation) {
		
		this.candidateEducationService.add(candidateEducation);
		return this.candidateEducationService.add(candidateEducation);
		
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<CandidateEducation>> getAllSorted() {
		
		return this.candidateEducationService.getAllSorted();
	}
	
	

}
