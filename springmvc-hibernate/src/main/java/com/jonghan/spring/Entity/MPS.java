package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 21.
 */
@Entity
@Table(name = "T_API_MPS")
public class MPS implements Serializable{

    private static final long serialVersionUID = 6455981497467108586L;

    @Id
    @GeneratedValue
    @Column(name = "MPS_ID")
    private int mps_id;

    @Column(name = "MPS_NM")
    private String mps_nm;

    @Column(name = "MPS_IP")
    private String mps_ip;

    @Column(name = "MPS_PORT")
    private int mps_port;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Region.class)
    @JoinColumn(name = "RGN_ID")
    private Region region;

    @Column(name = "MPS_DESC")
    private String mps_desc;

    @Column(name = "MPS_FOV")
    private short mps_fov;

    public int getMps_id() {
        return mps_id;
    }

    public void setMps_id(int mps_id) {
        this.mps_id = mps_id;
    }

    public String getMps_nm() {
        return mps_nm;
    }

    public void setMps_nm(String mps_nm) {
        this.mps_nm = mps_nm;
    }

    public String getMps_ip() {
        return mps_ip;
    }

    public void setMps_ip(String mps_ip) {
        this.mps_ip = mps_ip;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public int getMps_port() {
        return mps_port;
    }

    public void setMps_port(int mps_port) {
        this.mps_port = mps_port;
    }

    public String getMps_desc() {
        return mps_desc;
    }

    public void setMps_desc(String mps_desc) {
        this.mps_desc = mps_desc;
    }

    public short getMps_fov() {
        return mps_fov;
    }

    public void setMps_fov(short mps_fov) {
        this.mps_fov = mps_fov;
    }
}
