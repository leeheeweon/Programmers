package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] ints = new int[]{1, 2, 3, 4, 5};
        solution(ints);
    }

    public static int[] solution(int[] numbers) {
        int[] doubling = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            doubling[i] = numbers[i] * 2;
        }
        return doubling;
    }
}
