package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{34, 5, 71, 29, 100, 34}, 123);
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if (answer > n) {
                break;
            }
        }

        return answer;
    }
}
