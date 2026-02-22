package org.example.anjali;

public class hello {

    public static void anjalisubtract(int a, int b) {
        int difference = a - b;
        System.out.println("Subtraction: " + difference);
    }

    public static void anjaliadd(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }


    public static void main(String[] args) {
        anjalisubtract(10, 5);
        anjaliadd(10,20);
    }
}
