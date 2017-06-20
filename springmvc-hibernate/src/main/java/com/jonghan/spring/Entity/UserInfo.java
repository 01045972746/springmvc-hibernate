package com.jonghan.spring.Entity;

/**
 * Created by jonghan on 17. 6. 20.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="T_API_USR")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 7067002737755992189L;

    @Id
    @Column(name="USR_ID")
    private String USR_ID;
    @Column(name="USR_PW")
    private String USR_PW;
    @Column(name="USR_EMAIL")
    private String USR_EMAIL;
    @Column(name="USR_NM")
    private String USR_NM;
    @Column(name="USR_ROLE")
    private String USR_ROLE;
    @Column(name="USR_ENB")
    private short USR_ENB;

    public String getUSR_ID() {
        return USR_ID;
    }

    public void setUSR_ID(String USR_ID) {
        this.USR_ID = USR_ID;
    }

    public String getUSR_PW() {
        return USR_PW;
    }

    public void setUSR_PW(String USR_PW) {
        this.USR_PW = USR_PW;
    }

    public String getUSR_EMAIL() {
        return USR_EMAIL;
    }

    public void setUSR_EMAIL(String USR_EMAIL) {
        this.USR_EMAIL = USR_EMAIL;
    }

    public String getUSR_NM() {
        return USR_NM;
    }

    public void setUSR_NM(String USR_NM) {
        this.USR_NM = USR_NM;
    }

    public String getUSR_ROLE() {
        return USR_ROLE;
    }

    public void setUSR_ROLE(String USR_ROLE) {
        this.USR_ROLE = USR_ROLE;
    }

    public short getUSR_ENB() {
        return USR_ENB;
    }

    public void setUSR_ENB(short USR_ENB) {
        this.USR_ENB = USR_ENB;
    }
}