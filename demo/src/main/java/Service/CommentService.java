package Service;

import Common.R;
import Model.request.CommentRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CommentService {
    public R addComment(CommentRequest commentRequest);
    public R deleteComment(Integer id); //根据唯一标识符删除评论
    public R addLike(Integer id);
    public R commentOfTeam(Integer TeamId);

}
