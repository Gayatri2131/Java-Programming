import java.util.*;

public class Condn1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//prints the entire line of the input
        int b = sc.nextInt();
        
        if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            if(a>b){
                System.out.println("a is greater than b");
            }
            else{
                System.out.println("b is greater than a");
            }
        }
    }
}
  
