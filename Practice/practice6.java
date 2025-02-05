//Write a program that takes three integers as input and prints the largest one.
import java.util.*;
public class practice6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the third number:");
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The largest number:"+ num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The largest number:"+ num2);
        }
        else{
            System.out.println("The largest number:"+ num3);
        }

    }
    
}
