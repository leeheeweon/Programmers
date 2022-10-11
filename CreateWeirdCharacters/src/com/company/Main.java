package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("try hello world");
    }

    public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for (String word : array) {
            cnt = word.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? word.toLowerCase() : word.toUpperCase();
        }

        return answer;
    }
}
