package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 20.
 */
@Entity
@Table(name = "T_API_SES")
public class SessionInfo implements Serializable {
    private static final long serialVersionUID = 1215087821913799432L;

    @Id
    @GeneratedValue
    @Column(name = "SES_ID")
    private int ses_id;
    @Column(name = "SES_XID")
    private int ses_xid;
    @Column(name = "SES_TIT")
    private String ses_tit;
    @Column(name = "SES_CRT")
    private String ses_crt;
    @Column(name = "SES_PWD")
    private String ses_pwd;
    @Column(name = "SES_STR")
    private long ses_str;
    @Column(name = "SES_END")
    private long ses_end;
    @Column(name = "MPS_ID")
    private int mps_id;
    @Column(name = "CNF_ID")
    private int cnf_id;
    @Column(name = "SES_CTR_OPT")
    private short ses_ctr_opt;
    @Column(name = "SES_ATO_OPT")
    private short ses_ato_opt;
    @Column(name = "SES_CHAT_OPT")
    private short ses_chat_opt;

    public int getSes_id() {
        return ses_id;
    }

    public void setSes_id(int ses_id) {
        this.ses_id = ses_id;
    }

    public int getSes_xid() {
        return ses_xid;
    }

    public void setSes_xid(int ses_xid) {
        this.ses_xid = ses_xid;
    }

    public String getSes_tit() {
        return ses_tit;
    }

    public void setSes_tit(String ses_tit) {
        this.ses_tit = ses_tit;
    }

    public String getSes_crt() {
        return ses_crt;
    }

    public void setSes_crt(String ses_crt) {
        this.ses_crt = ses_crt;
    }

    public String getSes_pwd() {
        return ses_pwd;
    }

    public void setSes_pwd(String ses_pwd) {
        this.ses_pwd = ses_pwd;
    }

    public long getSes_str() {
        return ses_str;
    }

    public void setSes_str(long ses_str) {
        this.ses_str = ses_str;
    }

    public long getSes_end() {
        return ses_end;
    }

    public void setSes_end(long ses_end) {
        this.ses_end = ses_end;
    }

    public int getMps_id() {
        return mps_id;
    }

    public void setMps_id(int mps_id) {
        this.mps_id = mps_id;
    }

    public int getCnf_id() {
        return cnf_id;
    }

    public void setCnf_id(int cnf_id) {
        this.cnf_id = cnf_id;
    }

    public short getSes_ctr_opt() {
        return ses_ctr_opt;
    }

    public void setSes_ctr_opt(short ses_ctr_opt) {
        this.ses_ctr_opt = ses_ctr_opt;
    }

    public short getSes_ato_opt() {
        return ses_ato_opt;
    }

    public void setSes_ato_opt(short ses_ato_opt) {
        this.ses_ato_opt = ses_ato_opt;
    }

    public short getSes_chat_opt() {
        return ses_chat_opt;
    }

    public void setSes_chat_opt(short ses_chat_opt) {
        this.ses_chat_opt = ses_chat_opt;
    }
}
