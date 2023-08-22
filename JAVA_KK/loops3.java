package JAVA_KK;

import java.util.Scanner;

public class loops3 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Values Please:");
    int a=in.nextInt();
    int b=in.nextInt();
    int c=in.nextInt();
  /*int max=a;
  if(b>max)
  {
max=b;
  }
  if(c>max){
    max=c;
  }*/
  int max=Math.max(c,Math.max(a,b));
  System.out.printf("Largest number:%d",max);
  }
  
}


