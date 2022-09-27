package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(new int[][]{{1,2},{2,3}},new int[][]{{3,4},{5,6}});
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] arr = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j <arr1[0].length ; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;
    }
}
