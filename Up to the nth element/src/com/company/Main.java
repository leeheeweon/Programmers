package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{5, 2, 1, 7, 5}, 3);
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        return answer;
    }
}
