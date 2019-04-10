package com.mydemo.swagger.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author lanjiao.luo
 * @date 2019/4/10 11:11
 **/
@ApiModel("用户")
public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @ApiModelProperty(value = "名称",required = true)
    private String name;
    @ApiModelProperty(value = "年龄",required = false)
    private String age;
}
