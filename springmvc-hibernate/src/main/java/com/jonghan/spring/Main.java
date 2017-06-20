package com.jonghan.spring;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by jonghan on 17. 6. 20.
 */
public class Main {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("qwer"));
        System.out.println("vsadasdvsdavasdvd");
    }
}
