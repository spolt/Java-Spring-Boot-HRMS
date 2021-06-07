package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "candidate_experiences")
public class CandidateExperience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "work_place_name")
	@NotNull
	@NotBlank
	private String workplaceName;
	
	@Column(name = "work_place_position")
	@NotNull
	@NotBlank
	private String workplacePosition;
	
	@NotNull
	@NotBlank
	@Column(name = "position_description")
	private String positionDescription;
	
	@Column(name = "start_date")
	@NotNull
	@NotBlank
	private Date startDate;
	
	@Column(name = "finish_date")
	@NotNull
	@NotBlank
	private Date finishDate;
	
	@ManyToOne()
	@JoinColumn(name = "cv_id")
	@NotNull
	@NotBlank
	private CurriculumVitae curriculumVitae;

}
