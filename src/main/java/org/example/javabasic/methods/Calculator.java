package org.example.javabasic.methods;

public class Calculator {

    public static int addition(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    public static int subtraction(int a, int b){
        int sum = a-b; // Business logic is to subtract 2 numbers
        return sum;
    }

    public static void main(String[] args){
        System.out.println(addition(10,11, 12));
    }


}
