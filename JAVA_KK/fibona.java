package JAVA_KK;

import java.util.Scanner;

public class fibona {
  public static void main(String[] args) {
    System.out.println("Enter the Range of N:");
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    int a=0,b=1,temp;
    int count=2;

    while(count<n)
    {
      temp=b;
      b=b+a;
      a=temp;
      count++;

    }
    System.out.println(b);
  }
  
}
