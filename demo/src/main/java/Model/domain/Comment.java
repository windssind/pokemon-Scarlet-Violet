package Model.domain;

import Common.R;
import Service.CommentService;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer TeamId;

    private String content; // 评论的内容

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Byte type;

    private Integer up; // 点赞的数量
}
