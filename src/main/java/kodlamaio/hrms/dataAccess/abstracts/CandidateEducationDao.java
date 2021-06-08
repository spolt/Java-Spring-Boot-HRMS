package kodlamaio.hrms.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CandidateEducation;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation, Integer>{
	
	

}
