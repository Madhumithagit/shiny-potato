package Basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class oddoreven {
  public static void main(String[]args){
      System.out.println("Enter the number");
      Scanner sc=new Scanner(System.in);
      int a= sc.nextInt();
      if(a%2 != 0){
          System.out.println("Weired");
      }else{
          System.out.println("Not Weired");
      }

  }
}
