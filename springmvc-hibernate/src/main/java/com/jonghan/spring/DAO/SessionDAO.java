package com.jonghan.spring.DAO;

import com.jonghan.spring.DAO.Interface.ISessionDAO;
import com.jonghan.spring.Entity.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Transactional
@Repository
public class SessionDAO implements ISessionDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public SessionInfo getSession(int SES_ID) {
        return hibernateTemplate.get(SessionInfo.class, SES_ID);
    }
}
