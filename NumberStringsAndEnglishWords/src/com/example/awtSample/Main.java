package com.example.awtSample;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution("one4seveneight");
    }
    public static int solution(String s) {
        String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
        String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};

        for (int i = 0; i <10 ; i++) {
            s = s.replace(word[i] , num[i]);
        }

        System.out.println("s = " + s);

        return Integer.parseInt(s);
    }

}
