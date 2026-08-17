import java.util.Scanner;
public class Functions2{

    public  static int calculateSum(int num1,int num2){
       int num=num1+num2;
        return num;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
         int num = calculateSum(num1, num2);
        System.out.println(num);
       }

}