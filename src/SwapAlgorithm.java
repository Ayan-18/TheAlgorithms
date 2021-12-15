class SwapAlgorithm {
    public static void main(String[] args) {
        swap(7, -2);
        swap(-9, 5);
        swap(10, 6);
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

//      a = a + b - (b = a);
        System.out.println(a + ":" + b);
    }
}