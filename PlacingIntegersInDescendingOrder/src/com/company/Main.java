package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        /*
        함수 solution은 정수 n을 매개변수로 입력받습니다.
        n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.
         */
        solution(118372);
    }

    public static long solution(long n) {
        ArrayList<String> nums = new ArrayList<>();

        for (int i = 0; i < String.valueOf(n).length(); i++) {
            if (i + 1 <= String.valueOf(n).length()) {
                nums.add(String.valueOf(n).substring(i, i + 1));
            }
        }

        return Long.parseLong(nums.stream().sorted(Comparator.reverseOrder()).map(String::toString).collect(Collectors.joining()));
    }
}
