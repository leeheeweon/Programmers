package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] ints = new int[]{1, 3, 5, 7};
        solution(ints);
    }

    public static int[] solution(int[] num_list) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{evenCount, oddCount};
    }
}
