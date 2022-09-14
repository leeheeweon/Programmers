package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] = -absolutes[i];
            }

            sum += absolutes[i];
        }

        return sum;
    }
}
