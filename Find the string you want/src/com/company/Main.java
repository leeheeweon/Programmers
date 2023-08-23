package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(solution("aaAA", "aaaaa"));
    }

    public static int solution(String myString, String pat) {
        return myString.toUpperCase().indexOf(pat.toUpperCase()) == -1 ? 0 : 1;
    }
}
