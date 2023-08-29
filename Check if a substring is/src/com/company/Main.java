package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("banana", "ana");
    }

    public static int solution(String my_string, String target) {
        int answer = 0;

        if (my_string.indexOf(target) >= 0) {
            answer = 1;
        }

        return answer;
    }
}
