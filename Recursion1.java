//print numbers 5 to 1 using recursion
class Recursion1 {
    public static void printNumbers(int n) {
        if(n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}