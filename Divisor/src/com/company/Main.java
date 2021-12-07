package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(solution(12));

    }

    private static int solution(int n) {
        if (n >= 0 && n <= 3000) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        } else {
            return -1;
        }
    }
}

