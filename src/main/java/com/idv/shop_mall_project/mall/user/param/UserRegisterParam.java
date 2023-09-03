package com.idv.shop_mall_project.mall.user.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author RickChou
 * @create 2023-09-03 下午 01:22
 */
@Data
public class UserRegisterParam implements Serializable {
    @ApiModelProperty("登录名")
    @NotEmpty(message = "登录名不能为空")
    private String loginName;

    @ApiModelProperty("用户密码")
    @NotEmpty(message = "密码不能为空")
    private String password;
}
