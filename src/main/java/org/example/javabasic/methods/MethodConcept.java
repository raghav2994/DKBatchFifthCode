package org.example.javabasic.methods;

public class MethodConcept {

    static int a = 5;
    static int b = 4;

    public static void main(String[] args){
         System.out.println(additionSecond());
    }

    public static void additionFirst(){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int additionSecond(){
        int sum = a + b;
        return sum;
    }

    public static String fetchingFlightPageTitle(){
      String flightPageTitle = "Flights";
      System.out.println(additionSecond());
      return flightPageTitle;
    }

}
