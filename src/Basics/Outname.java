package Basics;
import java.util.Scanner;

public class Outname {
    public static void main(String[]args){
        System.out.println("Enter your Name:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int b= sc.nextInt();
        double d = sc.nextDouble();
        boolean m = sc.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(m);
    }
}
