package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }

    static public double solution(int[] numbers) {
        double answer = Arrays.stream(numbers).average().getAsDouble();
        System.out.println(answer);
        return answer;
    }
}
