package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name="employers", uniqueConstraints = {@UniqueConstraint(columnNames = {"company_name"})})
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@PrimaryKeyJoinColumn(name = "user_id")
public class Employer extends User{
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone")
	private String phone;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdverts;
	
	
	public Employer() {
		
	}

	public Employer(int id, String email, String password, String companyName, String website, String phone,
			List<JobAdvert> jobAdverts) {
		super(id, email, password);
		this.companyName = companyName;
		this.website = website;
		this.phone = phone;
		this.jobAdverts = jobAdverts;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
}
