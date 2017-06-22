package com.jonghan.spring.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
@Controller
public class BlogController {

    private static final Logger logger = LogManager.getLogger(AppRestController.class.getName());


    @GetMapping("blogs")
    public String getet() {
        return "index";
    }
}
