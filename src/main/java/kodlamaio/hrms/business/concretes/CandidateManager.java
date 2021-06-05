package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CandidateService;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService{
	
	private final CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getCandidate() {
		return new SuccessDataResult<>(this.candidateDao.findAll(), "Success: İş arayanlar listelendi.");
	}

	@Override
	public Result addCandidate(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Success: Kullanıcı sisteme eklendi.(iş arayan)");
	}

}
