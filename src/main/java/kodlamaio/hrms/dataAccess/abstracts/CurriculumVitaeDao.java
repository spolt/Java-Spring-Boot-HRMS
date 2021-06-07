package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.CurriculumVitae;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;


public interface CurriculumVitaeDao extends JpaRepository<CurriculumVitae, Integer>{
	
	@Query("SELECT new kodlamaio.hrms.entities.dtos.CandidateCvDto"
			+ "(c.id,c.firstName,c.lastName,c.tcno, cv.id, cv.cvName, cl.coverLetter,"
			+ " ce.workplaceName, ce.startDate, ce.finishDate,cd.schoolName,cd.departmentName,"
			+ " cd.startYear, cd.finishYear, cs.skillName, cs.skillDescription, l.languageName,"
			+ " l.languageLevel, ck.linkUrl)"
			+ " From CurriculumVitae cv INNER JOIN cv.candidate c"
			+ " INNER JOIN cv.candidateCoverLetters cl"
			+ " INNER JOIN cv.candidateExperiences ce"
			+ " INNER JOIN cv.candidateSkills cs"
			+ " INNER JOIN cv.candidateLinks ck"
			+ " INNER JOIN cv.candidateLanguages l"
			+ " INNER JOIN cv.candidateEducations cd"
			+ " where c.id=:id")
	List<CandidateCvDto> getByIdCandidateWithExperiences(int id);

}
