package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println(solution("ABBAA", "AABB"));
    }

    public static int solution(String myString, String pat) {
        String newMyString = "";

        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(i, i + 1).equals("A")) {
                newMyString += "B";
            } else {
                newMyString += "A";
            }
        }

        System.out.println(newMyString);
        System.out.println(myString.indexOf(pat));
        System.out.println(newMyString.indexOf(pat));

        if (myString.indexOf(pat) > 0 || newMyString.indexOf(pat) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
