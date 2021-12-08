package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution("01093954690");
    }
    public static  String solution(String phone_number) {
        int length = phone_number.length();
        String lastPhoneNumber = phone_number.substring(length-4, length);
        String star ="";

        for (int i = 0; i <length-4 ; i++) {
            star= star.concat("*");
        }

        return star+lastPhoneNumber;
    }
}
