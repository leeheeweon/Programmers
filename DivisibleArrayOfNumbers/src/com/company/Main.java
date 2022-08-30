package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // [2, 36, 1, 3]	1	[1, 2, 3, 36]
        solution(new int[]{2, 36, 1, 3}, 1);
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] ints = Arrays.stream(arr).filter(a -> a % divisor == 0).sorted().toArray();

        if (Arrays.stream(ints).count() == 0) {
            return new int[]{-1};
        }

        return ints;
    }
}
