package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(98, 2);
    }

    public static int solution(int num, int n) {
        if (num % n == 0) {
            return 1;
        }
        return 0;
    }
}
