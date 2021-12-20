package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(5, 3);
    }
    public static long solution(int a, int b) {
        long sum = 0;

        if (a>b){
            for (int i = b; i <=a ; i++) {
                sum += i;
            }
        } else {
            for (int i = a; i <=b ; i++) {
                sum += i;
            }
        }

        return sum;
    }
}
