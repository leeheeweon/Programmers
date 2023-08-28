package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(10, 3);
    }

    public static int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer[count] = i;
                count++;
            }
        }

        return answer;
    }
}
