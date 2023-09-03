package com.idv.shop_mall_project.mall.user.controller;

import com.idv.shop_mall_project.core.common.ServiceResultEnum;
import com.idv.shop_mall_project.core.util.NumberUtil;
import com.idv.shop_mall_project.core.util.Result;
import com.idv.shop_mall_project.core.util.ResultGenerator;
import com.idv.shop_mall_project.mall.user.param.UserRegisterParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.idv.shop_mall_project.mall.user.service.UserService;
import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author RickChou
 * @create 2023-09-03 下午 01:05
 */


@RestController
@Api(value = "v1", tags = "2.商城用戶操作相關接口")
@RequestMapping("/api/v1")
public class PersonalAPI {

    @Autowired
    private UserService UserService;

    @PostMapping("/user/register")
    @ApiOperation(value = "用户注册", notes = "")
    public Result register(@RequestBody @Valid UserRegisterParam UserRegisterParam) {
        if (!NumberUtil.isPhone(UserRegisterParam.getLoginName())){
            return ResultGenerator.genFailResult(ServiceResultEnum.LOGIN_NAME_IS_NOT_PHONE.getResult());
        }
        String registerResult = UserService.register(UserRegisterParam.getLoginName(), UserRegisterParam.getPassword());


        //注册成功
        if (ServiceResultEnum.SUCCESS.getResult().equals(registerResult)) {
            return ResultGenerator.genSuccessResult();
        }
        //注册失败
        return ResultGenerator.genFailResult(registerResult);
    }
}
