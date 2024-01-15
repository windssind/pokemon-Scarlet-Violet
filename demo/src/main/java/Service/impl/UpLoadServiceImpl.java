package Service.impl;

import Common.R;
import Service.UpLoadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UpLoadServiceImpl implements UpLoadService {
    public R upLoad(String filePath, MultipartFile img) throws IOException {
        //根据上传路径创建文件夹File对象
        File saveAddress = new File(filePath);
        if (!saveAddress.exists()) {
            saveAddress.mkdirs();// 如果文件夹不存在 创建保存文件对应的文件夹
        }
        // 将上传的文件保存到指定路径
        img.transferTo(new File(filePath));
        return R.ok();
    }
}
