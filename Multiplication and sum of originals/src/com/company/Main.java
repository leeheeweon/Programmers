package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(new int[]{5, 7, 8, 3});
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int theProductOfAllElements = 1;
        int theSumSquareOfAllElements = 0;

        for (int i = 0; i < num_list.length; i++) {
            theProductOfAllElements *= num_list[i];
            theSumSquareOfAllElements += num_list[i];
        }

        if (Math.pow(theSumSquareOfAllElements, 2) > theProductOfAllElements) {
            answer = 1;
        }

        return answer;
    }
}
