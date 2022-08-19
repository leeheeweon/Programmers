package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {5, 5};
        solution(arr);
    }

    public static double solution(int[] arr) {
        double average = 0;
        double sum = 0;

        if (arr.length >= 1 && arr.length <= 100) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= -10000 && arr[i] <= 10000) {
                    sum += arr[i];
                }
            }
            average = sum / arr.length;
        }

        return average;
    }
}
