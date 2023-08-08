package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution("string", 5);
    }
    public static String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i <k ; i++) {
            answer += my_string;
        }

        return answer;
    }
}
