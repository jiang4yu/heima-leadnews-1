package com.heima.model.media.pojos;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.heima.model.annotation.IdEncrypt;
import lombok.Data;

import java.util.Date;

@Data
@TableName(value = "wm_fans_portrait")
public class WmFansPortrait {
    private Integer id;
    @IdEncrypt
    private Integer userId;
    private String name;
    private String value;
    @JsonIgnore
    private String burst;
    private Date createdTime;
}
