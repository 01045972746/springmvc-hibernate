package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jong-850 on 2017-06-22.
 */
@Entity
@Table(name = "PCOMMENT")
public class PCOMMENT implements Serializable {
    private static final long serialVersionUID = -2035173637996699379L;

    @Id
    @GeneratedValue
    @Column(name = "C_ID")
    private int c_id;

    @Column(name = "C_CRT")
    private String c_crt;

    @Column(name = "C_CNT")
    private String c_cnt;

    @Column(name = "C_RG_DT")
    private long c_rg_dt;

    @Column(name = "P_ID")
    private int p_id;

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_crt() {
        return c_crt;
    }

    public void setC_crt(String c_crt) {
        this.c_crt = c_crt;
    }

    public String getC_cnt() {
        return c_cnt;
    }

    public void setC_cnt(String c_cnt) {
        this.c_cnt = c_cnt;
    }

    public long getC_rg_dt() {
        return c_rg_dt;
    }

    public void setC_rg_dt(long c_rg_dt) {
        this.c_rg_dt = c_rg_dt;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}
