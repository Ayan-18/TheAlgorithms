import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {96, 65, 45, 12, 25, 24, 35, 85, 47};
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
        int index = binarySearch(num, 35);
        print(35, index);
    }

    public static int binarySearch(int[] array, int elementToSearch) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (elementToSearch == array[mid]) {
                return mid;
            } else if (elementToSearch > array[mid]) {
                first = mid + 1;
            } else if (elementToSearch < array[mid]) {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void print(int elementToSearch, int index) {
        if (index == -1) {
            System.out.println(elementToSearch + " not found");
        } else {
            System.out.println(elementToSearch + " found at index " + index);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean isSoarted = false;
        int a;
        while (!isSoarted) {
            isSoarted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSoarted = false;
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        }
    }
}