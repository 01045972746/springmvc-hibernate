package com.jonghan.spring.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 7.
 */
@Entity
@Table(name = "NOTICE")
public class Notice implements Serializable {

    private static final long serialVersionUID = -2470017220134216350L;

    @Id
    @Column(name = "NTC_ID")
    private int NTC_ID;
    @Column(name = "NTC_TITLE")
    private String NTC_TITLE;
    @Column(name = "NTC_CONTENT")
    private String NTC_CONTENT;

    public int getNTC_ID() {
        return NTC_ID;
    }

    public void setNTC_ID(int NTC_ID) {
        this.NTC_ID = NTC_ID;
    }

    public String getNTC_TITLE() {
        return NTC_TITLE;
    }

    public void setNTC_TITLE(String NTC_TITLE) {
        this.NTC_TITLE = NTC_TITLE;
    }

    public String getNTC_CONTENT() {
        return NTC_CONTENT;
    }

    public void setNTC_CONTENT(String NTC_CONTENT) {
        this.NTC_CONTENT = NTC_CONTENT;
    }
}
