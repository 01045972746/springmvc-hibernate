package com.jonghan.spring.Controller;

import com.jonghan.spring.Entity.POST;
import com.jonghan.spring.Service.Interface.IPostService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
@Controller
public class BlogController {

    private static final Logger logger = LogManager.getLogger(AppRestController.class.getName());

    @Autowired
    private IPostService postService;

    @GetMapping("blogs")
    public String getet() {
        List<POST> post =  postService.getAllPost();
        System.out.println(post);
        return "index";
    }
}
