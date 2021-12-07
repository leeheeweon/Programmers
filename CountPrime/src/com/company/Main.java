package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        solution(11);
        getPrime(11);
    }

    public static int solution(int n) {
            int count = 0;
            boolean flag;

            for (int i = 2; i <= n && i<1000000; i++) {
                flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    count++;
                }
            }

            return count;
    }

    public static int getPrime(int num) {
        ArrayList<Integer> prime = new ArrayList<>();

        int cnt = 0;
        prime.add(2);
        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < prime.size(); j++) {
                if (i % prime.get(j) == 0) {
                    break;
                }
                if (j + 1 == prime.size()) {
                    prime.add(i);
                }
            }
        }
        for (int i = 0; i < prime.size(); i++) {
            cnt++;
        }
        System.out.println(cnt);
        return cnt;
    }


}
