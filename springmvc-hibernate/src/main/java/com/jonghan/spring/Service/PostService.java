package com.jonghan.spring.Service;

import com.jonghan.spring.DAO.Interface.IPostDAO;
import com.jonghan.spring.Entity.POST;
import com.jonghan.spring.Service.Interface.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jong-850 on 2017-06-22.
 */
@Service
public class PostService implements IPostService {

    @Autowired
    private IPostDAO postDAO;

    @Override
    public List<POST> getAllPost() {
        return postDAO.getAllPost();
    }

    @Override
    public POST getPostByID(int p_id) {
        return postDAO.getPostByID(p_id);
    }
}
