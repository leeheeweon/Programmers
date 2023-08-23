package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{49, 12, 100, 276, 33}, 27);
    }

    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }

        return answer;
    }
}
