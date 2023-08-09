package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new String[]{"a", "b", "C"});
    }

    public static String solution(String[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
