package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ints = new int[]{149, 180, 192, 170};
        solution(ints, 167);
        System.out.println("test");
    }

    public static int solution(int[] array, int height) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                count++;
            }
        }
        return count;
    }
}
