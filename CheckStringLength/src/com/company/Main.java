package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(solution("s23456"));


    }

    public static boolean solution(String s) {
        if (s.length() < 1 || s.length() > 8) {
            return false;
        } else {
            int count = 0;

            if (s.length() == 4 || s.length() == 6) {
                for (int i = 0; i <s.length() ; i++) {
                    String result = s.substring(i,i+1);

                    for (int j = 0; j < 10; j++) {
                        if (result.equals(String.valueOf(j))) {
                            count++;
                        }
                    }
                }

                if (count == s.length()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}
