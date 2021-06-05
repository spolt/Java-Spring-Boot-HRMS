package kodlamaio.hrms.entities.concretes;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode (callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidates")
@PrimaryKeyJoinColumn(name = "user_id")
public class Candidate extends User{
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="tcno")
	private String tcno;
	
	@Column(name="birthdate")
	private Date birthDate;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateCoverLetter> candidateCoverLetters;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateLanguages> candidateLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade =  {CascadeType.ALL})
	private List<CandidateEducation> candidateEducation;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateExperience> candidateExperience;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidate", fetch = FetchType.LAZY)
	private CandidateImage candidateImage;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateSkill> candidateSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate", cascade = {CascadeType.ALL})
	private List<CandidateLink> candidateLinks;

}
