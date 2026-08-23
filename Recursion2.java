class Recursion2 {

    public static int printSum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + printSum(n - 1);
    }

    public static void main(String[] args) {
        int sum = printSum(5);
        System.out.println("Sum = " + sum);
    }
}