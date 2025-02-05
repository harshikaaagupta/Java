//Simple Calculator

import java.util.*;

public class practice4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("This calculator only performs binary operations.");
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("The binary operations that can be perfomed are:");

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Select which operation to be performed:");
        int num=sc.nextInt();
        switch(num){
            case 1 :
                System.out.println("The sum is:"+ (num1+num2));
                break;
            
            case 2:
                System.out.println("The difference is:"+ (num1-num2));
                break;
            
            case 3:
                System.out.println("The product is:"+ (num1*num2));
                break;
            
            case 4:
                System.out.println("The division is:"+ (num1/num2));
                break;
                
            default:
                System.out.println("Error!!");
            
        }

    }
    
}
