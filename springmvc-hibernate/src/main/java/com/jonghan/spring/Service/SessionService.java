package com.jonghan.spring.Service;

import com.jonghan.spring.DAO.Interface.ISessionDAO;
import com.jonghan.spring.Entity.SessionInfo;
import com.jonghan.spring.Service.Interface.ISessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Service
public class SessionService implements ISessionService{

    @Autowired
    private ISessionDAO sessionDAO;

    @Override
    public SessionInfo getSession(int ses_id) {
        SessionInfo obj = this.sessionDAO.getSession(ses_id);
        return obj;
    }
}
