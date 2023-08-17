package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{2, 4});
    }

    public static int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }

        return answer;
    }
}
