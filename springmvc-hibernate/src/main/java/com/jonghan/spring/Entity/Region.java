package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 22.
 */
@Entity
@Table(name = "T_API_RGN")
public class Region implements Serializable {
    private static final long serialVersionUID = 3069694821970809585L;

    @Id
    @GeneratedValue
    @Column(name = "RGN_ID")
    int rgn_id;

    @Column(name = "RGN_NM")
    String rgn_nm;

    @Column(name = "RGN_DESC")
    String rgn_desc;

    public int getRgn_id() {
        return rgn_id;
    }

    public void setRgn_id(int rgn_id) {
        this.rgn_id = rgn_id;
    }

    public String getRgn_nm() {
        return rgn_nm;
    }

    public void setRgn_nm(String rgn_nm) {
        this.rgn_nm = rgn_nm;
    }

    public String getRgn_desc() {
        return rgn_desc;
    }

    public void setRgn_desc(String rgn_desc) {
        this.rgn_desc = rgn_desc;
    }
}
