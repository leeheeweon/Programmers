package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(20);
    }

    public static int solution(int n) {
        int answer = 0;

        for (int a=1;a <= n ; a++){
            if (n%a==0){
                answer++;
            }
        }

        return answer;
    }
}
