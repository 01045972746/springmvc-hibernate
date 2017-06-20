package com.jonghan.spring.DAO;

import com.jonghan.spring.Entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Repository
@Transactional
public class UserInfoDAO implements IUserInfoDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public UserInfo getActiveUser(String userName) {
        UserInfo activeUserInfo = new UserInfo();
        List<?> list = hibernateTemplate.find("FROM UserInfo WHERE USR_ID=? and USR_ENB=?",
                userName, (short)1);
        if(!list.isEmpty()) {
            activeUserInfo = (UserInfo)list.get(0);
        }
        return activeUserInfo;
    }
}
