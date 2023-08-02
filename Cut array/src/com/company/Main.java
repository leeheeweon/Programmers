package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ints = new int[]{1, 2, 3, 4, 5};
        solution(ints, 1, 3);

    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            answer[count] = numbers[i];
            count++;
        }

        return answer;
    }
}
