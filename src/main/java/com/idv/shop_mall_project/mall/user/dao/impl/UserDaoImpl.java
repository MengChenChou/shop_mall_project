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
        session.persist(record);
        return 1;
    }

    @Override
    public int insertSelective(User record) {
        session.persist(record);
        return 1;
    }

    @Override
    public User selectByPrimaryKey(Long userId) {
        return session.get(User.class, userId);
    }

    @Override
    public User selectByLoginName(String loginName) {
        System.out.println("#######################################");
        System.out.println(loginName);
        System.out.println("#######################################");
        // 這邊要修正
        final String sql = "select * from USER "
                + "where login_name = :loginName";
        User user1 = session.createNativeQuery(sql, User.class)
                .setParameter("loginName", loginName)
                .uniqueResult();
        System.out.println(user1);
        return user1;


//        return session.get(User.class, loginName);
//        return null;
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
