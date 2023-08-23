package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{3, 4, 5, 2, 1});
    }

    public static int solution(int[] num_list) {
        String odd = "";
        String even = "";
        int answer =0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            }
        }

        System.out.println(even);
        return answer;
    }
}
