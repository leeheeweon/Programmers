package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        solution("qwer");
        solution("abcde");
    }

    public static String solution(String s) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.length() % 2 == 0) {
                answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
            } else {
                answer = s.substring(s.length() / 2, s.length() / 2 + 1);
            }
        }

        System.out.println(answer);

        return answer;
    }
}
