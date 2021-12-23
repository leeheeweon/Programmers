package com.company;

import java.security.MessageDigest;
import java.util.Base64;

public class Main {

    public static void main(String[] args) throws Exception {
        String encryptPassword = encryptPassword("asd123!@#$", "fa0001");
        System.out.println("encryptPassword = " + encryptPassword);
    }

    public static String encryptPassword(String password, String id) throws Exception {

        if (password == null) {
            return "";
        }

        byte[] hashValue = null; // 해쉬값

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        md.reset();
        md.update(id.getBytes());

        hashValue = md.digest(password.getBytes());

        return new String(Base64.getEncoder().encode(hashValue));
    }
}
