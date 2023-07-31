package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        solution(580000);
    }

    public static int solution(int price) {
        if (price >= 100000 && price < 300000) {
            price = (int) (price * 0.95);
        } else if (price >= 300000 && price < 500000) {
            price = (int) (price * 0.90);
        } else if (price >= 500000) {
            price = (int) (price * 0.80);
        }

        return price;
    }
}
