package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{1, 2, 3, 4, 5}, 3);
    }

    public static int solution(int[] num_list, int n) {
        int answer = 0;

        for (int num : num_list) {
            if (num == n) {
                answer = 1;
            }
        }

        return answer;
    }
}
