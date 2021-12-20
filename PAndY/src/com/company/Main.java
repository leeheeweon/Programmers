package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        solution("pPoooyY");
    }
    static boolean solution(String s) {
        int p = 0;
        int y = 0;

        for (int i = 0; i <s.length() ; i++) {
           String chcek = s.substring(i,i+1);

           if (chcek.equalsIgnoreCase("y")){
               y++;
           } else if (chcek.equalsIgnoreCase("p")){
               p++;
           }

            System.out.println("i = " + chcek);
        }
        System.out.println("p = " + p);
        System.out.println("y = " + y);

        if (p==y){
            return true;
        } else {
            return false;
        }
    }
}
