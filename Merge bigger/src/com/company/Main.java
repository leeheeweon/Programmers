package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(8, 9);
    }

    public static int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        if (ab > ba) {
            return ab;
        }

        return ba;
    }
}
