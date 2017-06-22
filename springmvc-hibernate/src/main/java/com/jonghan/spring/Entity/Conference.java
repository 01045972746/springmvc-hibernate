package com.jonghan.spring.Entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jonghan on 17. 6. 21.
 */
@Entity
@Table(name = "T_API_CNF")
public class Conference implements Serializable {

    private static final long serialVersionUID = -4164105995567616334L;

    @Id
    @GeneratedValue
    @Column(name = "CNF_ID")
    private int cnf_id;

    @Column(name = "CNF_NM")
    private String cnf_nm;

    @Column(name = "CNF_MAX_STM")
    private int cnf_max_stm;

    @Column(name = "CNF_MAX_BIT")
    private int cnf_max_bit;

    @Column(name = "CNF_MIN_STM")
    private int cnf_min_stm;

    @Column(name = "CNF_MIN_BIT")
    private int cnf_min_bit;

    public int getCnf_id() {
        return cnf_id;
    }

    public void setCnf_id(int cnf_id) {
        this.cnf_id = cnf_id;
    }

    public String getCnf_nm() {
        return cnf_nm;
    }

    public void setCnf_nm(String cnf_nm) {
        this.cnf_nm = cnf_nm;
    }

    public int getCnf_max_stm() {
        return cnf_max_stm;
    }

    public void setCnf_max_stm(int cnf_max_stm) {
        this.cnf_max_stm = cnf_max_stm;
    }

    public int getCnf_max_bit() {
        return cnf_max_bit;
    }

    public void setCnf_max_bit(int cnf_max_bit) {
        this.cnf_max_bit = cnf_max_bit;
    }

    public int getCnf_min_stm() {
        return cnf_min_stm;
    }

    public void setCnf_min_stm(int cnf_min_stm) {
        this.cnf_min_stm = cnf_min_stm;
    }

    public int getCnf_min_bit() {
        return cnf_min_bit;
    }

    public void setCnf_min_bit(int cnf_min_bit) {
        this.cnf_min_bit = cnf_min_bit;
    }
}
