import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서
         * 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
         *
         * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
         *
         * l	r	result
         * 5	555	[5, 50, 55, 500, 505, 550, 555]
         */
        solution(5, 555);
    }

    public static int[] solution(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}