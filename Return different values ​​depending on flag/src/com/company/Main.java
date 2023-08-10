package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(-4, 7, true);
    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;

        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }

        return answer;
    }
}
