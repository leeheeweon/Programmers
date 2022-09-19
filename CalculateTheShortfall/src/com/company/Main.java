package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(3, 20, 4);
    }

    public static long solution(int price, int money, int count) {
        long result = money;

        for (int i = 1; i <= count; i++) {
            result -= price * i;
        }

        if (result < 0) {
            return -result;
        }

        return 0;
    }
}
