package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(solution(999));
    }

    public static int solution(int hp) {
        int answer = 0;
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnts = 1;

        if (hp % generalAnt == 0) {
            answer = hp / generalAnt;
            return answer;
        } else {
            answer = hp / generalAnt;
            hp = hp % generalAnt;
        }

        if (hp % soldierAnt == 0) {
            answer += hp / soldierAnt;
            return answer;
        } else {
            answer += hp / soldierAnt;
            hp = hp % soldierAnt;
        }

        if (hp % workerAnts == 0) {
            answer += hp / workerAnts;
            return answer;
        } else {
            answer += hp / workerAnts;
            hp = hp % workerAnts;
        }

        return answer;
    }
}
