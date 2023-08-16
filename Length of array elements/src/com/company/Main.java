package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution(new String[]{"We", "are", "the", "world!"});
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i <strlist.length ; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}
