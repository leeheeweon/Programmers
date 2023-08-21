package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{3, 4, 5, 2, 1});
    }

    public static int solution(int[] num_list) {
        String even ="";
        String odd = "";

        for (int num : num_list) {
            if (num % 2 == 0) {
                even += String.valueOf(num);
            } else {
                odd += String.valueOf(num);
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
