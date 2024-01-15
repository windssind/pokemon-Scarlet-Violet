package Service.impl;

import Common.R;
import Mapper.TeamMapper;
import Model.domain.Team;
import Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.DocFlavor;

@Service
public class TeamServiceImpl implements TeamService {
    // 一个service里面调用另外一个service，不合理
    @Autowired
    private TeamMapper teamMapper ;
    @Override
    public R ShareTeam(Team team) {
        if(teamMapper.insert(team)  > 0){
            return R.success("上传队伍成功！");
        }else {
            return R.error("上传队伍失败...");
        }
    }
}
