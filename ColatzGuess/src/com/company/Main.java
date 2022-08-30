package com.company;

public class Main {

    public static void main(String[] args) {
        /**
         * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
         * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
         * 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
         * 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
         */

        solution(6);
    }

    public static int solution(int num) {
        long number = num;
        int answer;
        for (answer = 0; answer < 500; answer++) {
            if (number == 1) {
                return answer;
            } else {
                if (number % 2 == 0) {
                    number /= 2;
                } else{
                    number = number * 3 + 1;
                }
            }
        }
        return -1;
    }
}
