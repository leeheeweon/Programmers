package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{0, 31, 24, 10, 1, 9});
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
