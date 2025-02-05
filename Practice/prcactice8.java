//Write a Java program to compute the factorial of a number provided by the user.
import java.util.Scanner;

public class prcactice8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int res=1;
        for(int i=1;i<=num;i++){
            res=res*i;
        }
        System.out.println("The factorial of "+ num +" is : "+ res);
    }
    
}
