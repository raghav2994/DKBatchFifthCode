package org.example.javabasic.methodChainingConcept;

import org.example.javabasic.oopsConcept.abstractionConcept.C;

public class CakeFactory {

    public CakeFactory getABread(String cakeFlavour){
        System.out.println("Got a bread for the cake " + cakeFlavour);
        return this;
    }

    public CakeFactory makeACake(){
        System.out.println("Making a cake ");
        return this;
    }

    public CakeFactory addTopings(){
        System.out.println("Added Toppings");
        return this;
    }

    public CakeFactory cakeIsReady(){
        System.out.println("Cake is ready");
        return this;
    }
}
