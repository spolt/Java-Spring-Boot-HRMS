package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode (callSuper = false)
@Entity
@Table(name = "staffs")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class Staff extends User{
	
	@Id
	@Column(name="user_id")
	private int id;
	
	@Column(name="staff_no")
	private int staffno;
	
	@Column(name="staff_firstname")
	private String firstname;
	
	@Column(name="staff_lastname")
	private String lastname;
}
