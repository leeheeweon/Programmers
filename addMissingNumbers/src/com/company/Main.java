package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0});
    }

    public static int solution(int[] numbers) {
        return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }
}
