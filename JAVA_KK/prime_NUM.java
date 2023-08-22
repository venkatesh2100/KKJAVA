package JAVA_KK;
import java.util.Scanner;
public class prime_NUM {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter any Number:");
    int n=in.nextInt();
    Boolean ans=isprime(n);
    System.out.println(ans);

  }
  static Boolean isprime(int n){
    if(n<=1){
      return false;
    }
    int c=2;
    while(c*c<=n){
      if(n%c==0){
        return false;
      }
      c++;

    }
    return c*c > n;
  }
  
}
