package com.idv.shop_mall_project.mall.user.service.impl;

import com.idv.shop_mall_project.core.util.PageQueryUtil;
import com.idv.shop_mall_project.core.util.PageResult;
import com.idv.shop_mall_project.mall.user.param.UserUpdateParam;
import com.idv.shop_mall_project.mall.user.service.UserService;

/**
 * @author RickChou
 * @create 2023-08-20 下午 03:27
 */
public class UserServiceImpl implements UserService {
    @Override
    public String register(String loginName, String password) {
        return null;
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
