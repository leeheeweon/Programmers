package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(3, 4, new boolean[]{true, false, false, true, true});
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a;
            }
            a = a + d;
        }

        return answer;
    }
}
