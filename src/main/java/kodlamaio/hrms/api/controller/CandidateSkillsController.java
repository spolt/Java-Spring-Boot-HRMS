package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateSkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CandidateSkill;

@RestController
@RequestMapping("/api/candidateSkills")
public class CandidateSkillsController {
	
	private CandidateSkillService candidateSkillService;

	public CandidateSkillsController(CandidateSkillService candidateSkillService) {
		super();
		this.candidateSkillService = candidateSkillService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateSkill candidateSkill) {
		return this.candidateSkillService.add(candidateSkill);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateSkill>> getAll() {
		return this.candidateSkillService.getAll();
	}

}
