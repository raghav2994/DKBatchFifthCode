package org.example.javabasic.oopsConcept.inheritenceConcept;

public class Father extends GrandFather {

    public static void Land(){
        System.out.println("Land of Father");
    }

    private static void audiCar(){
        System.out.println("Audi CAR of father");
    }

    public static void main(String[] args){
        Land();
        audiCar();
        Diamond();
        Gold();

    }
}
