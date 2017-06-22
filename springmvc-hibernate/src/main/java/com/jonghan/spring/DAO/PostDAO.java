package com.jonghan.spring.DAO;

import com.jonghan.spring.DAO.Interface.IPostDAO;
import com.jonghan.spring.Entity.POSTING;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
@Repository
@Transactional
public class PostDAO implements IPostDAO{
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Override
    public List<POSTING> getAllPost() {
        String hql = "FROM POSTING as p ORDER BY p.P_REG_DATE";
        return (List<POSTING>) this.hibernateTemplate.find(hql);
    }

    @Override
    public POSTING getPostByID(int p_id) {
        return this.hibernateTemplate.get(POSTING.class, p_id);
    }
}
