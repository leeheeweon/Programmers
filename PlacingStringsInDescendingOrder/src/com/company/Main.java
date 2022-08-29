package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // "Zbcdefg"	"gfedcbZ"
        String s = "Zbcdefg";
        solution(s);
    }

    public static String solution(String s) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 <= s.length()) {
                list.add(s.substring(i, i + 1));
            }
        }

        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
}
