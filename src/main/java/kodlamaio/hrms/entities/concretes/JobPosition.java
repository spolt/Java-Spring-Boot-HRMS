package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@Table(name="job_positions")
public class JobPosition {
	
	@Id
	@Column(name="id")
	private int jobpositionId;
	
	@Column(name = "job_position")
	private String title;
	
	@OneToMany(mappedBy = "jobPosition")
	private List<JobAdvert> jobAdverts;

	public int getJobpositionId() {
		return jobpositionId;
	}

	public void setJobpositionId(int jobpositionId) {
		this.jobpositionId = jobpositionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
	

}
