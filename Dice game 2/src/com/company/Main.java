package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(4, 4, 4);
    }

    public static int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && b != a && a != c && c != b) {
            answer = a + b + c;
        } else {
            double v = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);

            if ((a == b && c != a) || (a == c && b != c) || (b == c && a != b)) {
                answer = (int) ((a + b + c) * v);
            } else if (a == b && c == b) {
                answer = (int) ((a + b + c) * v * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
            }
        }

        return answer;
    }
}
