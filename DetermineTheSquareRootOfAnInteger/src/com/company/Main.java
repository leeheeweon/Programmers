package com.company;

public class Main {

    public static void main(String[] args) {
        solution(500000000);
    }

    public static long solution(long n) {
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                return (i + 1) * (i + 1);
            }
        }

        return -1;
    }
}
