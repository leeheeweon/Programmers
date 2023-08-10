package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("abc1abc1abc");
    }

    public static String solution(String code) {
        String result = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            boolean equals = code.substring(i, i + 1).equals("1");

            if (equals && mode == 0) {
                mode = 1;
            } else if (equals && mode == 1) {
                mode = 0;
            }

            if (mode == 0 && i % 2 == 0 && !equals) {
                result += code.substring(i, i + 1);
            } else if (mode == 1 && i % 2 != 0 && !equals) {
                result += code.substring(i, i + 1);
            }
        }

        if (result.isEmpty()) {
            return "EMPTY";
        }

        return result;
    }
}
