package com.company;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int solution = solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;

        int[] intArray = Stream.of(sizes).
                flatMapToInt(IntStream::of).toArray();

        for(int i = 0; i < intArray.length; i+=2) {
            if(intArray[i]>=intArray[i+1]) {
                if(intArray[i]>max)
                    max = intArray[i];
                if(intArray[i+1]>=min)
                    min = intArray[i+1];
            }
            else{
                int temp = intArray[i];
                intArray[i]=intArray[i+1];
                intArray[i+1]=temp;
                if(intArray[i+1]>=min)
                    min = intArray[i+1];
                if(intArray[i]>max)
                    max = intArray[i];
            }
        }
        answer = max*min;
        return answer;
    }
}
