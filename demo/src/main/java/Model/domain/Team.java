package Model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

@TableName (value = "Team")
public class Team {
    private Integer uid;
    private String name;
    @TableId(type  = IdType.AUTO)
    private Integer TeamId;
    private String type; // 队伍类型
    private String introduction; // 作者写的队伍介绍

    // 下面这些原理还得搞懂
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    //

    // 对应的图片和租借码
    private String pic;
    private String RentalCode;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeamId() {
        return TeamId;
    }

    public void setTeamId(Integer teamId) {
        TeamId = teamId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getRentalCode() {
        return RentalCode;
    }

    public void setRentalCode(String rentalCode) {
        RentalCode = rentalCode;
    }

    public Team(Integer uid, String name, String type, String introduction, String pic, String rentalCode) {
        this.uid = uid;
        this.name = name;
        this.type = type;
        this.introduction = introduction;
        this.pic = pic;
        RentalCode = rentalCode;
    }
}
