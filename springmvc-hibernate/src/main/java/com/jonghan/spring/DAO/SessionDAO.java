package com.jonghan.spring.DAO;

import com.jonghan.spring.DAO.Interface.ISessionDAO;
import com.jonghan.spring.Entity.MPS;
import com.jonghan.spring.Entity.Region;
import com.jonghan.spring.Entity.SessionInfo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Transactional
@Repository
public class SessionDAO implements ISessionDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public SessionInfo getSession(int ses_id) {
        return hibernateTemplate.get(SessionInfo.class, ses_id);
    }

    @Override
    public Region getRegion(int rgn_id) {

        System.out.println(sessionFactory.toString());

        List<?> list = sessionFactory.getCurrentSession()
                .createQuery("FROM Region WHERE RGN_ID = :RGN_ID")
                .setParameter("RGN_ID",rgn_id)
                .list();


        return (Region)list.get(0);
    }

    @Override
    public MPS getMPS(int mps_id) {
        List<?> list = hibernateTemplate.find("FROM MPS WHERE MPS_ID = ?", mps_id);
        return (MPS)list.get(0);
    }
}
