package com.idv.shop_mall_project.mall.user.dao.impl;

import com.idv.shop_mall_project.core.util.PageQueryUtil;
import com.idv.shop_mall_project.mall.entity.User;
import com.idv.shop_mall_project.mall.user.dao.UserDao;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author RickChou
 * @create 2023-08-20 下午 03:23
 */
@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private Session session;
    @Override
    public int deleteByPrimaryKey(Long userId) {
        final StringBuilder hql = new StringBuilder()
                .append("UPDATE user SET is_delete = 1");
        if(userId != null){
            hql.append("WHERE user_id = :userId and is_deleted = 0");
        }
        Query query = session.createQuery(hql.toString());
        if(userId != null){
            query.setParameter("userId", userId);
        }

        return query.executeUpdate();

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
