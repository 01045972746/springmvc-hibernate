package com.jonghan.spring.Entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jonghan.kim on 22/06/2017.
 */
@Entity
@Table(name = "POST")
public class POST implements Serializable{
    private static final long serialVersionUID = 8404799363042035020L;

    @Id
    @GeneratedValue
    @Column(name = "P_ID")
    private int p_id;

    @Column(name = "P_TIT")
    private String p_tit;

    @Column(name = "P_CNT")
    private String p_cnt;

    @Column(name = "P_RG_DT")
    private long p_rg_dt;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "P_ID")
    private List<PCOMMENT> p_comments = new ArrayList<PCOMMENT>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "P_ID")
    @Fetch(value = FetchMode.SUBSELECT)
    private List<PPHOTO> p_photos = new ArrayList<PPHOTO>();


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

    public long getP_rg_dt() {
        return p_rg_dt;
    }

    public void setP_rg_dt(long p_rg_dt) {
        this.p_rg_dt = p_rg_dt;
    }

    public List<PCOMMENT> getP_comments() {
        return p_comments;
    }

    public void setP_comments(List<PCOMMENT> p_comments) {
        this.p_comments = p_comments;
    }

    public List<PPHOTO> getP_photos() {
        return p_photos;
    }

    public void setP_photos(List<PPHOTO> p_photos) {
        this.p_photos = p_photos;
    }
}
