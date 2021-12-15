public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {96, 65, 45, 12, 25, 24, 35, 48, 85, 47};
        int index = linearSearch(num, 35);
        print(35, index);
    }

    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length - 1; i++) {
            if (elementToSearch == array[i]) {
                return i;
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
}