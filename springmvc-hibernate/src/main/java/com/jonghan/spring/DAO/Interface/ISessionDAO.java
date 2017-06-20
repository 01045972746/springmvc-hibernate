package com.jonghan.spring.DAO.Interface;

import com.jonghan.spring.Entity.SessionInfo;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface ISessionDAO {
    SessionInfo getSession(int ses_id);
}
