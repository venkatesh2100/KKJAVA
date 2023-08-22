package JAVA_KK;
import java.util.Scanner;
public class arrayD12 {
  public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the array Elements:");
    int arr[]=new int[5];
    for(int i=0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }
for(int num :arr){
  System.out.print(num+" ");
}
}
  }