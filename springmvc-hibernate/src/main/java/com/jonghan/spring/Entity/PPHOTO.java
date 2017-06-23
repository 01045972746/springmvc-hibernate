package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 23.
 */
@Entity
@Table(name = "PPHOTO")
public class PPHOTO implements Serializable{
    private static final long serialVersionUID = -4627347689765362570L;

    @Id
    @GeneratedValue
    @Column(name = "H_ID")
    private int h_id;

    @Column(name = "H_RG_DT")
    private long h_rg_dt;

    @Column(name = "H_PATH")
    private String h_path;

    @Column(name = "P_ID")
    private int p_id;

    public int getH_id() {
        return h_id;
    }

    public void setH_id(int h_id) {
        this.h_id = h_id;
    }

    public long getH_rg_dt() {
        return h_rg_dt;
    }

    public void setH_rg_dt(long h_rg_dt) {
        this.h_rg_dt = h_rg_dt;
    }

    public String getH_path() {
        return h_path;
    }

    public void setH_path(String h_path) {
        this.h_path = h_path;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}
