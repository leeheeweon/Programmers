package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{3, 6, 2});
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[0] + sides[1] > sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }
}
