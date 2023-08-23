package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{12, 4, 15, 46, 38, -2, 15});
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
