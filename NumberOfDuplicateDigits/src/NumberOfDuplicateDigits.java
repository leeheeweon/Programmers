public class NumberOfDuplicateDigits {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 1, 2, 3, 4, 5};

        System.out.println(solution(ints , 1));
    }

    public static int solution(int[] array, int n) {
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] == n) {
                count ++ ;
            }
        }
        return count;
    }
}
