package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] ints = new int[]{1, 2, 3, 4, 5};
        solution(ints);
    }

    public static int[] solution(int[] num_list) {
        int[] result = new int[num_list.length];
        int count = 0;

        for (int i = num_list.length-1; i >= 0 ; i--) {
            System.out.println(num_list[i]);
            result[count] = num_list[i];
            count++;
        }

        return result;
    }
}
