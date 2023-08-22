package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        solution(1234);
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < String.valueOf(n).length() ; i++) {
            answer += Integer.parseInt(String.valueOf(n).substring(i, i + 1));
        }

        return answer;
    }
}
