package JAVA_KK;

import java.util.Arrays;

public class arrfunD12 {
  public static void main(String[] args) {
    int[] nums={12,34,32,43};
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
  }
  static void change(int arr){
    arr [0]=99;
  }
  
}
