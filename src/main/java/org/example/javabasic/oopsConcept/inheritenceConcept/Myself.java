package org.example.javabasic.oopsConcept.inheritenceConcept;

public class Myself extends Father{

    public static void stocks(){
        System.out.println("Stocks owned by me");
    }

    public static void crypto(){
        System.out.println("Crypto owned by me");
    }

    public static void main(String[] args){
        Diamond();
        Gold();

        Land();
        stocks();
        crypto();
    }
}
