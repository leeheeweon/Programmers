package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(3);
    }

    public static String solution(int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result += "수";
            } else {
                result += "박";
            }
        }

        System.out.println("result = " + result);

        return result;
    }
}
