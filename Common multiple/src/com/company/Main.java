package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(60, 2, 3);
    }

    public static int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        }

        return 0;
    }
}
