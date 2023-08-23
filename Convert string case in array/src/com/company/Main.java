package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new String[]{"AAA", "BBB", "CCC", "DDD"});
    }

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}
