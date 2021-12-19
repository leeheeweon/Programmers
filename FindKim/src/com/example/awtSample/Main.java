package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String[] seoul = {"Jane", "Kim"};
        solution(seoul);
    }

    public static String solution(String[] seoul) {
        String result = "";

        for (int i = 0; i < seoul.length; i++) {
            String s = seoul[i];
            if (s.equals("Kim")) {
                result = "김서방은 " + i + "에 있다.";
            }
        }

        return result;
    }
}
