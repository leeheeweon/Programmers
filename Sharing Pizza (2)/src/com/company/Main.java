package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(6);
    }

    public static int solution(int n) {
        int slice = 6;
        int pizza = 1;
        boolean flag = true;

        while (flag) {
            if ((slice * pizza) % n == 0) {
                flag = false;
                break;
            }
            pizza++;

        }

        return pizza;
    }
}
