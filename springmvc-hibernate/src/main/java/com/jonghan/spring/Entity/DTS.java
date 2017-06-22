package com.jonghan.spring.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 21.
 */
public class DTS implements Serializable {
    private static final long serialVersionUID = 3298167813630555862L;

    @Id
    @GeneratedValue
    @Column(name = "DTS_ID")
    private int dts_id;

    @Column(name = "DTS_NM")
    private String dts_nm;

    @Column(name = "DTS_IP")
    private String dts_ip;

    @Column(name = "RGN_ID")
    private int rgn_id;

    @Column(name = "DTS_DESC")
    private String dts_desc;

    public int getDts_id() {
        return dts_id;
    }

    public void setDts_id(int dts_id) {
        this.dts_id = dts_id;
    }

    public String getDts_nm() {
        return dts_nm;
    }

    public void setDts_nm(String dts_nm) {
        this.dts_nm = dts_nm;
    }

    public String getDts_ip() {
        return dts_ip;
    }

    public void setDts_ip(String dts_ip) {
        this.dts_ip = dts_ip;
    }

    public int getRgn_id() {
        return rgn_id;
    }

    public void setRgn_id(int rgn_id) {
        this.rgn_id = rgn_id;
    }

    public String getDts_desc() {
        return dts_desc;
    }

    public void setDts_desc(String dts_desc) {
        this.dts_desc = dts_desc;
    }
}
