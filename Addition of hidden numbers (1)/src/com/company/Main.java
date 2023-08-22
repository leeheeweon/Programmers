package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("aAb1B2cC34oOp");
    }

    public static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.replaceAll("[a-zA-Z]", "").length(); i++) {
            answer += Integer.parseInt(my_string.replaceAll("[a-zA-Z]", "").substring(i, i + 1));
        }

        return answer;
    }
}
