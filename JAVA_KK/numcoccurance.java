package JAVA_KK;

import java.util.Scanner;

public class numcoccurance {
  public static void main(String[] args) {
  Scanner in= new Scanner(System.in);
  System.out.println("Enter any Number:");
  int n=in.nextInt();
  System.out.println("which number you wanna check:");
  int v=in.nextInt();
  int count=0;
  int rem;
  while(n>0){
    rem=n%10;
    if(rem==v){
      count++;
    }
    n=n/10;
  }
  System.out.println(count);


  }
  
}
