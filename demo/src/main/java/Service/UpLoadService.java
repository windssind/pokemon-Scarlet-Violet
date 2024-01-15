package Service;

import Common.R;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


// 用于上传照片到服务器对应的文件夹
public interface UpLoadService {
    R upLoad(String filePath, MultipartFile img) throws IOException;
}
