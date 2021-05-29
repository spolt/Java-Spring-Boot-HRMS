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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_adverts")
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="advert_id")
	private int advertId;
	
	@Column(name = "open_positions")
	private int openPositions;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name= "published_date")
	private Date publishedDate;
	
	@Column(name = "deadline")
	private Date deadline;

	@Column(name = "salary_min")
	private int salaryMin;
	
	@Column(name= "salary_max")
	private int salaryMax;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne
	@JoinColumn(name="employer_id")
	private Employer employer;
	
	

}
