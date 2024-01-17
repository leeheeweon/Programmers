public class Main {
    public static void main(String[] args) {
        /**
         * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
         * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
         * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         * numer1	denom1	numer2	denom2	result
         * 1	2	3	4	[5, 4]
         */

        solution(1, 2, 3, 4);
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        for(int i = numerator-1; i > 1; i--) {
            // 기약분수로 만들기
            if(numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
            }
        }

        int[] answer = { numerator, denominator };
        return answer;
    }
}