package Controller;

import Common.R;
import Model.domain.Team;
import Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
public class TeamController {
    String UpLoadPath = "/data/Img/Team";
    @Autowired
    private TeamService teamService;
    public R ShareTeam(Integer uid, String name,MultipartFile img,String type,String introduction,String RentalCode){
        String fileName = img.getOriginalFilename();
        String path = UpLoadPath + File.separator + fileName;
        if (fileName == null) return R.error("未获取到队伍图片");
        return teamService.ShareTeam(new Team(uid,name,type,introduction,path,RentalCode));
    }
}
