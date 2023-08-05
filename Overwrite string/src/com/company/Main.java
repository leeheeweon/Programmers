package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        solution("He11oWor1d", "lloWorl", 2);
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        new StringBuffer().append(my_string);
        return new StringBuffer().replace(s, s+overwrite_string.length(), overwrite_string).toString();
    }
}
