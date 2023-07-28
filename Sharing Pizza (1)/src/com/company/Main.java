package com.company;

public class Main {

    public static void main(String[] args) {
        solution(15);
    }

    public static int solution(int n) {
        return n%7!=0?(n/7)+1:n/7;
    }
}
