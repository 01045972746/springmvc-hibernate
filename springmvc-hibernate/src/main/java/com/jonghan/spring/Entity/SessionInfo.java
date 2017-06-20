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
    private int SES_ID;
    @Column(name = "SES_XID")
    private int SES_XID;
    @Column(name = "SES_TIT")
    private String SES_TIT;
    @Column(name = "SES_CRT")
    private String SES_CRT;
    @Column(name = "SES_PWD")
    private String SES_PWD;
    @Column(name = "SES_STR")
    private long SES_STR;
    @Column(name = "SES_END")
    private long SES_END;
    @Column(name = "MPS_ID")
    private int MPS_ID;
    @Column(name = "CNF_ID")
    private int CNF_ID;
    @Column(name = "SES_CTR_OPT")
    private short SES_CTR_OPT;
    @Column(name = "SES_ATO_OPT")
    private short SES_ATO_OPT;
    @Column(name = "SES_CHAT_OPT")
    private short SES_CHAT_OPT;

    public int getSES_ID() {
        return SES_ID;
    }

    public void setSES_ID(int SES_ID) {
        this.SES_ID = SES_ID;
    }

    public int getSES_XID() {
        return SES_XID;
    }

    public void setSES_XID(int SES_XID) {
        this.SES_XID = SES_XID;
    }

    public String getSES_TIT() {
        return SES_TIT;
    }

    public void setSES_TIT(String SES_TIT) {
        this.SES_TIT = SES_TIT;
    }

    public String getSES_CRT() {
        return SES_CRT;
    }

    public void setSES_CRT(String SES_CRT) {
        this.SES_CRT = SES_CRT;
    }

    public String getSES_PWD() {
        return SES_PWD;
    }

    public void setSES_PWD(String SES_PWD) {
        this.SES_PWD = SES_PWD;
    }

    public long getSES_STR() {
        return SES_STR;
    }

    public void setSES_STR(long SES_STR) {
        this.SES_STR = SES_STR;
    }

    public long getSES_END() {
        return SES_END;
    }

    public void setSES_END(long SES_END) {
        this.SES_END = SES_END;
    }

    public int getMPS_ID() {
        return MPS_ID;
    }

    public void setMPS_ID(int MPS_ID) {
        this.MPS_ID = MPS_ID;
    }

    public int getCNF_ID() {
        return CNF_ID;
    }

    public void setCNF_ID(int CNF_ID) {
        this.CNF_ID = CNF_ID;
    }

    public short getSES_CTR_OPT() {
        return SES_CTR_OPT;
    }

    public void setSES_CTR_OPT(short SES_CTR_OPT) {
        this.SES_CTR_OPT = SES_CTR_OPT;
    }

    public short getSES_ATO_OPT() {
        return SES_ATO_OPT;
    }

    public void setSES_ATO_OPT(short SES_ATO_OPT) {
        this.SES_ATO_OPT = SES_ATO_OPT;
    }

    public short getSES_CHAT_OPT() {
        return SES_CHAT_OPT;
    }

    public void setSES_CHAT_OPT(short SES_CHAT_OPT) {
        this.SES_CHAT_OPT = SES_CHAT_OPT;
    }
}
