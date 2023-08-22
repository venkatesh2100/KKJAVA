package JAVA_KK;

public class maxValueInArray {
  public static void main(String[] args){
    int[] arr={1,2,3,4,5,6,99,10};

    System.out.println(maxvalue(arr));
    }
  static int maxvalue(int arr[]){
    int max=arr[0];
    for (int i = 1; i < arr.length; i++) {
      if(arr[i]>max){
        max=arr[i];

      }
     
  }
   return max;
    }
}
