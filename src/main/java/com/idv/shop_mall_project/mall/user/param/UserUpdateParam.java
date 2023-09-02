package com.idv.shop_mall_project.mall.user.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author RickChou
 * @create 2023-09-03 上午 06:38
 * 用户修改param
 */
@Data
public class UserUpdateParam implements Serializable {
    @ApiModelProperty("用戶暱稱")
    private String nickName;

    @ApiModelProperty("用戶密碼(需要MD5加密)")
    private String passwordMd5;

    @ApiModelProperty("個性簽名")
    private String introduceSign;
}
