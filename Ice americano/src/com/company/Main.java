package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(15000);
    }

    public static int[] solution(int money) {
        int iceAmericano = 5500;
        int count = money / iceAmericano;
        int smallChange = money - (iceAmericano * count);
        int[] answer = new int[]{count, smallChange};
        return answer;
    }
}
