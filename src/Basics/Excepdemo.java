package Basics;

import java.sql.SQLOutput;

public class Excepdemo {
    public static void main(String[]args){
        int a=10;
        int b=0;
        int c=0;
            try {
               int d = a / b;
            }
            catch(Exception e){
                System.out.println("Error occured");
            }
        System.out.println(c);
        System.out.println("This eh program");

    }
}
