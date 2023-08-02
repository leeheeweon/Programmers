package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String str = "jaron";
        solution(str);
    }

    public static String solution(String my_string) {
        String result = "";

        for (int i = my_string.length(); i > 0; i--) {
            result += my_string.substring(i - 1, i);
        }

        return result;
    }
}
