package JAVA_KK;

import java.util.Scanner;

public class casecheck {
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the WORD:");
    char name=in.next().trim().charAt(0);
    if(name>'a' && name<'z')
    {
      System.out.println("Lower case ");
    }
    else
    {
      System.out.println("Upper case ");
    }
  }
  
}
