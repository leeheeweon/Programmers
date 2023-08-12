package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{2, 1, 6});
    }

    public static int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {
            result[i] = num_list[i];
        }

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            result[result.length - 1] =
                num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            result[result.length - 1] =
                num_list[num_list.length - 1] * 2;
        }

        return result;
    }
}
