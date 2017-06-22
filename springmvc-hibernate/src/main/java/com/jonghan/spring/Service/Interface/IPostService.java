package com.jonghan.spring.Service.Interface;

import com.jonghan.spring.Entity.POST;

import java.util.List;

/**
 * Created by jong-850 on 2017-06-22.
 */
public interface IPostService {
    List<POST> getAllPost();
    POST getPostByID(int p_id);
}
