package Service.impl;

import Common.R;
import Mapper.CommentMapper;
import Model.domain.Comment;
import Model.request.CommentRequest;
import Service.CommentService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public R addComment(CommentRequest commentRequest) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentRequest,comment);
        if (commentMapper.insert(comment) > 0){
            return R.success("评论成功!");
        }else {
            return R.error("评论失败!");
        }
    }

    @Override
    public R deleteComment(Integer id) {
        if (commentMapper.deleteById(id) > 0){
            return R.success("删除评论成功!");
        }else {
            return R.error("删除评论失败!");
        }
    }

    @Override
    public R addLike(Integer id) {
        UpdateWrapper < Comment > updateWrapper = new UpdateWrapper<Comment>();
        updateWrapper.eq("id",id).setSql("like = like + 1");
        if (commentMapper.update(null,updateWrapper) > 0){
            return R.success("点赞成功!");
        }else {
            return R.error("点赞失败...");
        }
    }

    @Override
    public R commentOfTeam(Integer TeamId) {
        QueryWrapper < Comment> queryWrapper = new QueryWrapper<Comment>();
        queryWrapper.eq("TeamId",TeamId);
        return R.success(null,commentMapper.selectList(queryWrapper)); // 第一个为message，第二个为数据
    }
}
