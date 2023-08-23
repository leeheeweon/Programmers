package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new int[]{2, 3, 4, 5});
    }

    public static int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else if (num_list.length <= 10) {
            answer = 1;

            for (int num : num_list) {
                answer *= num;
            }
        }

        return answer;
    }
}
