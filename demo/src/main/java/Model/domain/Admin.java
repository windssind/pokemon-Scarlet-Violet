package Model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

// TableName 需要引入mybatis-plus
@TableName(value = "admin")
// 这个对象也对应一个表中存储的对象
public class Admin {
    @TableId(type = IdType.AUTO) // 声明这个为数据库中的主键， 后面的AUTO代表主键自动增长（唯一标识数据库中的数据）
    private Integer id;

    private String name;

    private String password;
}
