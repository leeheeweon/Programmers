package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(2, 91);
    }

    public static int solution(int a, int b) {
        int plus = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int multiply = 2 * a * b;

        if (plus > multiply) {
            return plus;
        }

        return multiply;
    }
}
