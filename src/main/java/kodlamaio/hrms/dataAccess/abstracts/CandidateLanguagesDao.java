package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.CandidateLanguages;

public interface CandidateLanguagesDao extends JpaRepository<CandidateLanguages, Integer>{
	
	CandidateLanguages geyById(int id);
	
	List<CandidateLanguages> getAll();

}
