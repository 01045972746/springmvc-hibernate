package com.jonghan.spring.Service.Interface;

import com.jonghan.spring.Entity.MPS;
import com.jonghan.spring.Entity.Region;
import com.jonghan.spring.Entity.SessionInfo;
import org.springframework.security.access.annotation.Secured;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface ISessionService {
    @Secured({"ROLE_ADMIN"})
    SessionInfo getSession(int ses_id);
    @Secured({"ROLE_ADMIN"})
    Region getRegion(int rgn_id);
    @Secured({"ROLE_ADMIN"})
    MPS getMPS(int mps_id);
}
