package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        solution(new int[]{1,1,3,3,0,1,1});
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int value = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }
}
