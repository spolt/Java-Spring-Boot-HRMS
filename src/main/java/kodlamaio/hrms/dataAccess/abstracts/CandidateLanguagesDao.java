package kodlamaio.hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CandidateLanguages;

public interface CandidateLanguagesDao extends JpaRepository<CandidateLanguages, Integer>{
	
}
