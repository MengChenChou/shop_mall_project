package com.idv.shop_mall_project.mall.user.dao.impl;

import com.idv.shop_mall_project.core.util.PageQueryUtil;
import com.idv.shop_mall_project.mall.entity.User;
import com.idv.shop_mall_project.mall.user.dao.UserDao;

import java.util.List;

/**
 * @author RickChou
 * @create 2023-08-20 下午 03:23
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int deleteByPrimaryKey(Long userId) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        return null;
    }

    @Override
    public User selectByLoginName(String loginName) {
        return null;
    }

    @Override
    public User selectByLoginNameAndPasswd(String loginName, String password) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }

    @Override
    public List<User> findMallUserList(PageQueryUtil pageUtil) {
        return null;
    }

    @Override
    public int getTotalMallUsers(PageQueryUtil pageUtil) {
        return 0;
    }

    @Override
    public int lockUserBatch(Long[] ids, int lockStatus) {
        return 0;
    }
}
