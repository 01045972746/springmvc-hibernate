package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
@Entity
@Table(name = "POSTING")
public class POSTING implements Serializable{
    private static final long serialVersionUID = 8404799363042035020L;

    @Id
    @GeneratedValue
    @Column(name = "P_ID")
    private int p_id;

    @Column(name = "P_TIT")
    private String p_tit;

    @Column(name = "P_CNT")
    private String p_cnt;

    @Column(name = "P_REG_DATE")
    private long p_reg_date;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_tit() {
        return p_tit;
    }

    public void setP_tit(String p_tit) {
        this.p_tit = p_tit;
    }

    public String getP_cnt() {
        return p_cnt;
    }

    public void setP_cnt(String p_cnt) {
        this.p_cnt = p_cnt;
    }

    public long getP_reg_date() {
        return p_reg_date;
    }

    public void setP_reg_date(long p_reg_date) {
        this.p_reg_date = p_reg_date;
    }
}
