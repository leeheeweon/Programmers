package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,2,7,6,4};
        solution(nums);
    }
    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    if (isPrime(n)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
