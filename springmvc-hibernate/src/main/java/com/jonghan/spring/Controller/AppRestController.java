package com.jonghan.spring.Controller;

import com.jonghan.spring.Entity.MPS;
import com.jonghan.spring.Entity.Region;
import com.jonghan.spring.Entity.SessionInfo;
import com.jonghan.spring.Service.Interface.ISessionService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
@RequestMapping("cli")
public class AppRestController {

    private static final Logger logger = LogManager.getLogger(AppRestController.class.getName());

    @Autowired
    private ISessionService sessionService;

    @GetMapping("session/{id}")
    public ResponseEntity<SessionInfo> getSessionInfoByID(@PathVariable("id") Integer id) {
        SessionInfo sessionInfo = this.sessionService.getSession(id);
        logger.info(new ResponseEntity<SessionInfo>(sessionInfo, HttpStatus.OK));
        return new ResponseEntity<SessionInfo>(sessionInfo, HttpStatus.OK);
    }

    @GetMapping("test/{id}")
    public ResponseEntity<Region> getRegionInfoByID(@PathVariable("id") Integer id) {
        Region rgnInfo = this.sessionService.getRegion(id);
        logger.info(new ResponseEntity<Region>(rgnInfo, HttpStatus.OK));
        return new ResponseEntity<Region>(rgnInfo, HttpStatus.OK);
    }

    @GetMapping("mps/{id}")
    public ResponseEntity<MPS> getMPSInfoByID(@PathVariable("id") Integer id) {
        MPS mpsinfo = this.sessionService.getMPS(id);
        logger.info(new ResponseEntity<MPS>(mpsinfo, HttpStatus.OK));
        return new ResponseEntity<MPS>(mpsinfo, HttpStatus.OK);
    }


}
