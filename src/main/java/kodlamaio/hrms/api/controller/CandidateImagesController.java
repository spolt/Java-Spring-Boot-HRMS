package kodlamaio.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.services.CloudinaryService;

@RestController
@RequestMapping("api/images")
public class CandidateImagesController {
	
	private CloudinaryService cloudinarService;
	private CandidateService candidateService;
	
	@Autowired
	public CandidateImagesController(CloudinaryService cloudinarService, CandidateService candidateService) {
		super();
		this.cloudinarService = cloudinarService;
		this.candidateService = candidateService;
	}
	

}
