package com.jonghan.spring.Controller;

import com.jonghan.spring.Entity.SessionInfo;
import com.jonghan.spring.Service.Interface.ISessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Controller
@RequestMapping("mob")
public class AppRestController {

    @Autowired
    private ISessionService sessionService;

    @GetMapping("session/{id}")
    public ResponseEntity<SessionInfo> getArticleById(@PathVariable("id") Integer id) {
        SessionInfo sessionInfo = this.sessionService.getSession(id);
        return new ResponseEntity<SessionInfo>(sessionInfo, HttpStatus.OK);
    }


}
