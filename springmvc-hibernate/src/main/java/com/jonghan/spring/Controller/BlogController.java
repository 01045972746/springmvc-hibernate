package com.jonghan.spring.Controller;

import com.jonghan.spring.Entity.POST;
import com.jonghan.spring.Service.Interface.IPostService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
@Controller
public class BlogController {

    private static final Logger logger = LogManager.getLogger(BlogController.class.getName());

    @Autowired
    private IPostService postService;

    @GetMapping("posts")
    public String getAllposting() {
        List<POST> posts = this.postService.getAllPost();
        return "index";
    }

    @GetMapping("post/{id}")
    public String getPostByID(Model model, @PathVariable("id") int p_id) {
        POST post = this.postService.getPostByID(p_id);
        model.addAttribute("post", post);
        return "post";
    }
}
