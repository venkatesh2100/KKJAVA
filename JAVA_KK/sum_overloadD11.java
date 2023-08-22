package JAVA_KK;

public class sum_overloadD11 {
  public static void main(String[] args) {
    int ans=sum(67,48,84);
    System.out.println("Sum :"+ans);
  }
  static int sum(int a, int b){
   return a+b;
  }
  static int sum(int a,int b,int c){
    return a+b+c;

  }
}
