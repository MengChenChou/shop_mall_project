package com.idv.shop_mall_project.mall.user.service.impl;

import com.idv.shop_mall_project.core.common.ServiceResultEnum;
import com.idv.shop_mall_project.core.common.Constants;
import com.idv.shop_mall_project.core.util.MD5Util;
import com.idv.shop_mall_project.core.util.PageQueryUtil;
import com.idv.shop_mall_project.core.util.PageResult;
import com.idv.shop_mall_project.mall.entity.User;
import com.idv.shop_mall_project.mall.user.dao.UserDao;
import com.idv.shop_mall_project.mall.user.param.UserUpdateParam;
import com.idv.shop_mall_project.mall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author RickChou
 * @create 2023-08-20 下午 03:27
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao UserDao;

    @Override
    public String register(String loginName, String password) {
        if (UserDao.selectByLoginName(loginName) != null) {
            return ServiceResultEnum.SAME_LOGIN_NAME_EXIST.getResult();
        }
        User registerUser = new User();
        registerUser.setLoginName(loginName);
        registerUser.setNickName(loginName);
        registerUser.setIntroduceSign(Constants.USER_INTRO);
        String passwordMD5 = MD5Util.MD5Encode(password, "UTF-8");
        registerUser.setPasswordMd5(passwordMD5);
        if (UserDao.insertSelective(registerUser) > 0) {
            return ServiceResultEnum.SUCCESS.getResult();
        }
        return ServiceResultEnum.DB_ERROR.getResult();
    }

    @Override
    public String login(String loginName, String passwordMD5) {
        return null;
    }

    @Override
    public Boolean updateUserInfo(UserUpdateParam mallUser, Long userId) {
        return null;
    }

    @Override
    public Boolean logout(Long userId) {
        return null;
    }

    @Override
    public Boolean lockUsers(Long[] ids, int lockStatus) {
        return null;
    }

    @Override
    public PageResult getNewBeeMallUsersPage(PageQueryUtil pageUtil) {
        return null;
    }
}
