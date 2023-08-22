package JAVA_KK;

import java.util.Scanner;

public class GreetingD11 {
  public static void main(String[] args) {
    //greeting();
    //  greeting();
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the name:");
    String name=in.next();
    String person=myGreet(name);
    System.out.println(person);


  }
  static String myGreet(String naam){
    String message="Hello "+ naam;
    return message;
  }
  }
 /* static void greeting(){
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the Name:");

    String name=in.nextLine();
    System.out.printf("Hi welcome to Java %s",name);
 }}*/