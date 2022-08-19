package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);

        for(int i = 0;i < participant.length-1;i++){
            if(completion[i].equals(participant[i])) {
                continue;
            }
            else {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }
}
