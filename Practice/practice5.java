//Check Even or Odd
import java.util.*;

public class practice5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("It is an even number.");
        }
        else{
            System.out.println("It is an odd number.");
        }
    }
    
}
