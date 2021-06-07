package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateCoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateCoverLetter;

@RestController
@RequestMapping("/api/candidatesCoverLetter")
public class CandidatesCoverLetterController {
	
	private final CandidateCoverLetterService candidateCoverLetterService;
	
	@Autowired
	public CandidatesCoverLetterController(CandidateCoverLetterService candidateCoverLetterService) {
		super();
		this.candidateCoverLetterService = candidateCoverLetterService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateCoverLetter candidateCoverLetter) {
		return this.candidateCoverLetterService.add(candidateCoverLetter);
	}
	
	@PostMapping("/update")
	public Result update(CandidateCoverLetter candidateCoverLetter) {
		return this.candidateCoverLetterService.update(candidateCoverLetter);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateCoverLetter>> getAll() {
		
		return this.candidateCoverLetterService.getAll();
		
	}
}
