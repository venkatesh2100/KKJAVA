package JAVA_KK;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDarrayD12 {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int [][] arr=new int [3][3];
    System.out.println(arr.length);
    for(int row=0;row<arr.length;row++){
      for(int col=0;col<arr[row].length;col++){
        arr[row][col]=in.nextInt();
      }
     // for(row=0;row<arr.length;row++){
       // for(int col=0;col<arr[row].length;col++){
         // System.out.println(arr[row][col] +" ");
        //}
      }
      for(int row=0;row<arr.length;row++){
        System.out.println(Arrays.toString(arr[row]));
      }
    }

  }

