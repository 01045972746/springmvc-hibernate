package com.jonghan.spring.DAO.Interface;

import com.jonghan.spring.Entity.POST;

import java.util.List;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
public interface IPostDAO {
    List<POST> getAllPost();
    POST getPostByID(int p_id);
}
