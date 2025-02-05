//Write a Java program that takes a number as input and prints its multiplication table up to 10.
import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("The multiplication table of "+ num);
        for(int i=1 ;i<11;i++){
            System.out.println(""+ num + "x"+""+ i +"="+ (num*i));
        }

    }
    
}
