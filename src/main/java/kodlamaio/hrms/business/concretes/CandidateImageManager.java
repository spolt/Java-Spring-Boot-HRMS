package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.CandidateImageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateImageDao;
import kodlamaio.hrms.entities.concretes.CandidateImage;

@Service
public class CandidateImageManager implements CandidateImageService{
	
	private CandidateImageDao candidateImageDao;

	@Override
	public Result add(CandidateImage candidateImage, MultipartFile imageFile) {
		return null;
	}

	@Override
	public Result update(CandidateImage candidateImage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<CandidateImage>> getAll() {
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.findAll());
	}

	@Override
	public DataResult<List<CandidateImage>> getByCandidateId(int candidateId) {
		
		return new SuccessDataResult<List<CandidateImage>>(this.candidateImageDao.getByCandidateId(candidateId));
	}

}
