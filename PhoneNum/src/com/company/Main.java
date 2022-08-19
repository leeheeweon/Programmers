package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("01033334444");
    }

    public static String solution(String phone_number) {
        int length = phone_number.length() - 4;
        StringBuilder star = new StringBuilder();
        star.append("*".repeat(Math.max(0, length)));
        return star + phone_number.substring(length, phone_number.length());

    }
}
