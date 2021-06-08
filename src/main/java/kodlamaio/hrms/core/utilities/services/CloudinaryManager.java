package kodlamaio.hrms.core.utilities.services;

import java.io.IOException;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService{
	
	private Cloudinary cloudinary;
	
	public CloudinaryManager() {
		
		this.cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "dqgqobaq8","api_key", "559339541974452", "api_secret", "eE1xn_x35Jx1rEIbnZafbIdvnRM"));
	}

	@SuppressWarnings("rawtypes")
	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try 
		{
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap = (Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ErrorDataResult<Map>("Hata test");
	}
	
	

}
