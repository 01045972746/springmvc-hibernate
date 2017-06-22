package com.jonghan.spring.DAO;

import com.jonghan.spring.DAO.Interface.IPostDAO;
import com.jonghan.spring.Entity.POST;
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
public class PostDAO implements IPostDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Override
    public List<POST> getAllPost() {
        String hql = "FROM POST p ORDER BY p.p_rg_dt DESC";
        List<POST> posts = sessionFactory.getCurrentSession().createQuery(hql)
                .setMaxResults(3)
                .list();
        return posts;
    }

    @Override
    public POST getPostByID(int p_id) {
        return this.hibernateTemplate.get(POST.class, p_id);
    }
}
