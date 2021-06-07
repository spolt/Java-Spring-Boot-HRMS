package kodlamaio.hrms.entities.dtos;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateCvDto {
	
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String tcno;
	
	private int cv_id;
	
	private String cvName;
	
	private String coverLetter;
	
	private String workplaceName;
	
	private Date startDate;
	
	private Date finishDate;
	
	private String schoolName;
	
	private String departmentName;
	
	private int startYear;
	
	private int finishYear;
	
	private String skillName;
	
	private String skillDescription;
	
	private String languageName;
	
	private int languageLevel;
	
	private String linkUrl;
	

}
