package JAVA_KK;
import java.util.Scanner;
public class loops {
  public static void main(String[] args) {
    System.out.println("Enter the Salary");
    Scanner in=new Scanner(System.in);
    int salary;
    salary=in.nextInt();
    if(salary>20000)
    {
     salary=salary+3000;
    }
    else if(salary>10000)
    {
      salary=salary+2000;
    }
    else{
      salary=salary+1000;
    }
    System.out.printf("SALARY :%d",salary);

  }
  
}
