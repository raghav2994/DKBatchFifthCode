package org.example.javabasic.methodChainingConcept;

public class ChristmasOcassion {

    public static void main(String[] args){

        CakeFactory cake = new CakeFactory();
        cake.getABread("Blackcurrent").makeACake().addTopings().cakeIsReady();
//          cake.getABread("Blackcurrent");
//          cake.makeACake();
//          cake.addTopings();
//          cake.cakeIsReady();
    }
}
