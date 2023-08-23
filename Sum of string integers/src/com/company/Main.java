package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution("123456789");
    }

    public static int solution(String num_str) {
        int answer = 0;

        for (int i = 0; i <num_str.length() ; i++) {
            answer += Integer.parseInt(num_str.substring(i, i + 1));
        }

        return answer;
    }
}
