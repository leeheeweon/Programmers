package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10});
    }

    public static int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length - 5];
        int j = 0;

        for (int i = 5; i < num_list.length; i++) {
            answer[j] = num_list[i];
            j++;
        }

        return answer;
    }
}
