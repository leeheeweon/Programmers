package com.company;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] ints = new int[]{3, 76, 24};
        solution(ints);
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] integers = Arrays.stream(emergency.clone()).boxed().toArray(Integer[]::new);
        Arrays.sort(integers, Collections.reverseOrder());

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (emergency[i] == integers[j]) {
                    answer[i] = j + 1;
                }
            }
        }

        return answer;
    }
}
