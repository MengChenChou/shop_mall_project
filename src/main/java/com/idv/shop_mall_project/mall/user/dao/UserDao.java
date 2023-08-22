package com.idv.shop_mall_project.mall.user.dao;

import com.idv.shop_mall_project.core.util.PageQueryUtil;
import com.idv.shop_mall_project.mall.entity.User;

import java.util.List;

/**
 * @author RickChou
 * @create 2023-08-20 下午 03:26
 */
public interface UserDao {

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    User selectByLoginName(String loginName);

    User selectByLoginNameAndPasswd(String loginName, String password);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findMallUserList(PageQueryUtil pageUtil);

    int getTotalMallUsers(PageQueryUtil pageUtil);

    int lockUserBatch(Long[] ids, int lockStatus);
}
