package JAVA_KK;
import java.util.Scanner;
public class armsrtrong {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter any Number:");
    int n=in.nextInt();
    Boolean ans=isarmstrong(n);
    System.out.println("ans");

    
  }
  static Boolean isarmstrong(int n){
    int temp=n;
    int sum=0;
    while(n>0){
      int rem=n%10;
      sum=rem*rem*rem;
      n=n/10;
    }
    return sum==temp;
    }
    return sum==temp;
  }
}
