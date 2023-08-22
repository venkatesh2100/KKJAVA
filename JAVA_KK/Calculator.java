package JAVA_KK;
import java.util.Scanner;
public class Calculator {
  public static void main(String[] args)
  
  {
    Scanner in= new Scanner(System.in);
    int ans=0;
    System.out.print("Enter the operator:");
// if user Press X or x the program should Quit
while(true)
{
  char op=in.next().trim().charAt(0);
  if(op=='+' || op=='-' || op=='*' || op=='%' ||op=='/'){
    System.out.println("Enter the Num1:");
    int num1=in.nextInt();
    System.out.println("Enter the Num2:");
    int num2=in.nextInt();
    if(op=='+'){
      ans=num1+num2;
    }
    if(op=='-'){
      ans=num1-num2;
    }
    if(op=='*'){
      ans=num1*num2;
    }
    if(op=='%'){
      ans=num1%num2;
    } if(op=='/'){
      ans=num1/num2;
    }
    
    else if(op=='x'||op=='X'){
      break;
    }
    else{
      System.out.println("Invalid Statement!!");
    }
  }
}

  
  System.out.println(ans);
}
}