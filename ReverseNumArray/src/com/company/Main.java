package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(12345);
    }

    public static int[] solution(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] arr = new int[length];
        int count = 0;

        while (n > 0) {
            long lastNum = n % 10;
            arr[count] = (int) lastNum;
            n /= 10;
            count++;
        }



        return arr;
    }
}
