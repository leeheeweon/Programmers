package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{5, 2, 1, 7, 5}, 2);
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (n - 1)];
        int j = 0;

        for (int i = n - 1; i < num_list.length; i++) {
            answer[j] = num_list[i];
            j++;
        }

        return answer;
    }
}
