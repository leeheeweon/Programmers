package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(new int[]{1, 2, 3, 100, 99, 98}, 3);
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if (k % 2 == 0) {
            for (int i = 0; i <arr.length ; i++) {
                answer[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i <arr.length ; i++) {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }
}
