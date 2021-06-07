package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "curriculum_vitaes")
public class CurriculumVitae {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name = "cv_name")
	private String cvName;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<CandidateCoverLetter> candidateCoverLetters;
	
	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<CandidateEducation> candidateEducations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<CandidateExperience> candidateExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<CandidateLanguages> candidateLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<CandidateLink> candidateLinks;
	
	@JsonIgnore
	@OneToMany(mappedBy = "curriculumVitae")
	private List<CandidateSkill> candidateSkills;
	
	

}
