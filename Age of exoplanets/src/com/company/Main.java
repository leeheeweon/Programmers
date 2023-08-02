package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(23);
    }

    public static String solution(int age) {
        String answer = "";
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j"};

        for (int i = 0; i < String.valueOf(age).length() ; i++) {
            answer += alphabet[Integer.parseInt(String.valueOf(age).substring(i, i + 1))];
        }

        return answer;
    }
}
