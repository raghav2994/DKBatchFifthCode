package org.example.javabasic.ObjectConcept;

public class ElectricityTest {

    private static void clickOnElectricity(){
        System.out.println("Clicked on electricity");
    }

    public static void main(String[] args){

        AmazonPayBaseClass apb1 = new AmazonPayBaseClass(); // Creating a Object
        MobilePrepaidTest mpt = new MobilePrepaidTest();

        mpt.clickOnMobileRecharge();

//
        apb1.openAmazonApp(); // Method Calling -> Object_name.methodName();
        apb1.clickOnAmazonPay();
        clickOnElectricity();
        apb1.fetchTitle("Electricity");

    }

}
