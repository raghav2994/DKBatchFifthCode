package org.example.javabasic.oopsConcept.abstractionConcept;

public class B extends A implements InterfaceConcept, InterfaceConceptTwo{


    @Override
    public void age() {
        System.out.println(2);
    }

    @Override
    public void add() {

    }

    @Override
    public int sub() {
        return 0;
    }

    @Override
    public float mul() {
        return 0;
    }

    @Override
    public void division() {

    }

    @Override
    public void maxValue() {

    }
}
