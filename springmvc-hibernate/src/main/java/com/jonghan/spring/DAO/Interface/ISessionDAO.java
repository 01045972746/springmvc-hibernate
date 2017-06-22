package com.jonghan.spring.DAO.Interface;

import com.jonghan.spring.Entity.MPS;
import com.jonghan.spring.Entity.Region;
import com.jonghan.spring.Entity.SessionInfo;

/**
 * Created by jonghan on 17. 6. 20.
 */
public interface ISessionDAO {
    SessionInfo getSession(int ses_id);
    Region getRegion(int rgn_id);
    MPS getMPS(int mps_id);
}
