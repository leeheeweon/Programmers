package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution("205");
    }

    public static String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            String substring = rsp.substring(i, i + 1);
            if (substring.equals("2")) {
                substring = "0";
            } else if (substring.equals("0")) {
                substring = "5";
            } else if (substring.equals("5")) {
                substring = "2";
            }
            answer += substring;
        }

        return answer;
    }
}
