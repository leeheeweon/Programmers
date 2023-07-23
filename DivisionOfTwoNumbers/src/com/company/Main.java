package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1 = 3;
        int num2 = 2;
        solution(num1, num2);
    }

    public static int solution(int num1, int num2) {
        int result = (int) ((double) num1 / (double) num2 * 1000);
        return result;
    }
}
