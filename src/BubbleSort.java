import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {19, 11, 3, 14, 16, 7, 1};
        boolean isSorted = false;
        int abc;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    isSorted = false;
                    abc = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = abc;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}