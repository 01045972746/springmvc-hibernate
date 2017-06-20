package com.jonghan.spring.DAO.Interface;

import com.jonghan.spring.Entity.UserInfo;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface IUserInfoDAO {
    UserInfo getActiveUser(String userName);
}
