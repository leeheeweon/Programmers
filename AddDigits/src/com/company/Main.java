package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(123);

    }
    public static int solution(int n) {
        int answer = 0;
        while (n>0) {
            answer += n%10;
            n/=10;
        }

        return answer;
    }
}
