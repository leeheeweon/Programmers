package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{1, 3, 2, 5, 4}, 9);
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if (result > budget) {
                answer = i;
                break;
            }

            if (result <= budget) {
                answer = d.length;
            }
        }
        return answer;
    }
}
