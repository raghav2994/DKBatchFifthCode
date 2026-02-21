package org.example.javabasic.methods;

public class MethodParameterConcept {

    public static void main(String[] args){

        addition(2,3);
        addition(5,9);
        addition(10,11);

        System.out.println(substraction(3,4));


    }


    public static void addition(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static int substraction(int a, int b){
        int sub = a-b;
        return sub;
    }

}
