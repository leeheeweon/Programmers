package com.company;


public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("programmers", "p");
    }

    public static String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
