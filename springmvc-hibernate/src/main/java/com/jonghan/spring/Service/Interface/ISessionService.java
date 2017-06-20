package com.jonghan.spring.Service.Interface;

import com.jonghan.spring.Entity.SessionInfo;
import org.springframework.security.access.annotation.Secured;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface ISessionService {
    @Secured({"ROLE_ADMIN"})
    SessionInfo getSession(int ses_id);
}
