package JAVA_KK;
import java.util.Scanner;
public class Sum {
  public static void main(String[] args) {
   int ans=sum2();
   System.out.println("sum:"+ans);
  }
  static int sum2(){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the Number 1:");
    int Num1=in.nextInt();
    System.out.println("Enter the Number 2:");
    int Num2=in.nextInt();
    int sum2=Num1+Num2;
    return sum2;
  }
  /*static void sum(){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the Number 1:");
    int Num1=in.nextInt();
    System.out.println("Enter the Number 2:");
    int Num2=in.nextInt();
    int sum=Num1+Num2;
    System.out.printf("The Sum is %d:",sum);
    }*/
}
