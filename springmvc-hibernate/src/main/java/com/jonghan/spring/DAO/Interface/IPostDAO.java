package com.jonghan.spring.DAO.Interface;

import com.jonghan.spring.Entity.POSTING;

import java.util.List;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
public interface IPostDAO {
    List<POSTING> getAllPost();
    POSTING getPostByID(int p_id);
}
