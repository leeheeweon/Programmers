package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution("banana", "nan");
    }

    public static int solution(String my_string, String is_prefix) {
        if (my_string.indexOf(is_prefix) == 0) {
            return 1;
        }

        return 0;
    }
}
