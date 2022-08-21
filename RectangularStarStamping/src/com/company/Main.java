package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder star = new StringBuilder("*");
        star.append("*".repeat(Math.max(0, a - 1)));

        for (int i = 0; i <b ; i++) {
            System.out.println(star);
        }

    }
}
