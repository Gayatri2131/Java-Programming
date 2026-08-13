//Butterfly Pattern
public class Pattern10 {
    public static void main(String args[]) {
        int n = 5;

        //upper half
        for (int i = 1; i <= n; i++) {
            //first part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //second part
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            //third part
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            //first part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //second part
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            //third part
            for (int l = 1; l <= i; l++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}