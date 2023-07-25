package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] ints = new int[]{1, 2, 7, 10, 11};
        solution(ints);
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
