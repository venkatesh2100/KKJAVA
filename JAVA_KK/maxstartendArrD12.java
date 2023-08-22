package JAVA_KK;

import java.util.Arrays;

public class maxstartendArrD12 {
  public static void main(String[] args){
    int[] arr={2,5,3,54,543,5332,83};
    reverse(arr);
    System.out.println(Arrays.toString(arr));
   // System.out.println(maxvalue(arr, 1, 7));

    }
    static void reverse(int[] arr){
      int start=0;
      int end=arr.length-1;
      while(start<end){
        //swap
        swap(arr,start , end);
        start++;
        end--;
      }


    }
    static void swap(int arr[],int index1,int index2){
      int temp=arr[index1];
      arr[index1]=arr[index2];
      arr[index2]=temp;
    
//  // static int maxvalue(int arr[],int start,int end){
//     int max=arr[start];
//     for (int i = start; i < end; i++) {
//       if(arr[i]>max){
//         max=arr[i];
//       }
      
//     }
// return max;
  }
}
