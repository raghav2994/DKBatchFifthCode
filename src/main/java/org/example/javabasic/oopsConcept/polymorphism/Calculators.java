package org.example.javabasic.oopsConcept.polymorphism;

public class Calculators {

    public static void main(String [] args){

    }

    public static void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int add(int a, int b, int c){
        int sum = a +b+c;
        return sum;
    }

    public static int add(){
        return 0;
    }

}
