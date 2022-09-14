package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("test");
        solution(new int[]{1, 2, 3, 4}, new int[]{-3, -1, 0, 2});
    }

    public static int solution(int[] a, int[] b) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }
}
