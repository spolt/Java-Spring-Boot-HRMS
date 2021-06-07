package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateExperience;

@RestController
@RequestMapping("/api/candidateExperiences")
public class CandidateExperiencesController {
	
	private CandidateExperienceService candidateExperienceService;
	
	@Autowired
	public CandidateExperiencesController(CandidateExperienceService candidateExperienceService) {
		super();
		this.candidateExperienceService = candidateExperienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateExperience candidateExperience) {
		
		return this.candidateExperienceService.add(candidateExperience);
		
	}
	
	@GetMapping("/getAllSorted")
	public DataResult<List<CandidateExperience>> getAllSorted() {
		
		return this.candidateExperienceService.getAllSorted();
	}
	
	

}
