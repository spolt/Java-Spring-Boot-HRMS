package kodlamaio.hrms.entities.dtos;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Candidate;
import kodlamaio.hrms.entities.concretes.CandidateCoverLetter;
import kodlamaio.hrms.entities.concretes.CandidateEducation;
import kodlamaio.hrms.entities.concretes.CandidateExperience;
import kodlamaio.hrms.entities.concretes.CandidateImage;
import kodlamaio.hrms.entities.concretes.CandidateLanguages;
import kodlamaio.hrms.entities.concretes.CandidateLink;
import kodlamaio.hrms.entities.concretes.CandidateSkill;

public class CandidateCvDto {
	
	public Candidate candidate;
	
	public List<CandidateCoverLetter> candidateCoverLetters;
	public List<CandidateExperience> candidateExperience;
	public List<CandidateEducation> candidateEducation;
	public List<CandidateSkill> candidateSkill;
	public List<CandidateLanguages> candidateLanguages;
	public List<CandidateLink> candidateLinks;
	public List<CandidateImage> cadidateImage;

}
