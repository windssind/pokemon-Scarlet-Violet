package Service;

import Common.R;
import Model.domain.Team;
import org.springframework.stereotype.Service;

public interface TeamService {
    public R ShareTeam(Team team);// 用team的话，可扩展性更好，如果Team的字段要修改的话直接修改Team这个类就行了
}
