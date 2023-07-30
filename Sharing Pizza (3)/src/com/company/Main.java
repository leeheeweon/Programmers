package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(4, 12);
    }

    public static int solution(int slice, int n) {
        int pizza = 1;

        if (n <= slice) {
            pizza = 1;
        } else {
            while (true) {
                if ((slice * pizza) / n == 0) {
                    pizza++;
                } else {
                    break;
                }
            }
        }

        return pizza;
    }
}
