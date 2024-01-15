package Controller;

import Common.R;
import Model.request.CommentRequest;
import Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// 可以获取对队伍的评论
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;


    // 提交评论
    @PostMapping("/comment/add")
    public R addComment(CommentRequest addCommentRequest) {
        return commentService.addComment(addCommentRequest);
    }

    // 删除评论
    @GetMapping("/comment/delete")
    public R deleteComment(@RequestParam Integer id) {
        return commentService.deleteComment(id);
    }

    // 获得指定队伍 ID 的评论列表
    @GetMapping("/comment/song/detail")
    public R commentOfTeamId(@RequestParam Integer TeamId) {
        return commentService.commentOfTeam(TeamId);
    }

    // 点赞
    @PostMapping("/comment/like")
    public R addLike(@RequestParam Integer id) {
        return commentService.addLike(id);
    }
}
