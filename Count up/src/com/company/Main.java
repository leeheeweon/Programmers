package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(3, 10);
    }

    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int j = 0;

        for (int i = start_num; i <= end_num; i++) {
            answer[j] = i;
            j++;
        }

        return answer;
    }
}
