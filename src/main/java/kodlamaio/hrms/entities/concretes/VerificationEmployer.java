package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "verification_employers")
public class VerificationEmployer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "created_date")
	private LocalDate createdDate = LocalDate.now();
	
	@Column(name = "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "verify_code")
	private String verifyCode;
	
	@Column(name = "employer_id")
	private int employerId;

}
