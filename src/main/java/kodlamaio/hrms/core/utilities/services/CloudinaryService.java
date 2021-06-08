package kodlamaio.hrms.core.utilities.services;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.core.utilities.results.DataResult;

public interface CloudinaryService {
	
	@SuppressWarnings("rawtypes")
	DataResult<Map> uploadImageFile(MultipartFile imageFile);

}
