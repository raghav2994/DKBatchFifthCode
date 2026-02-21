package org.example.javabasic.ObjectConcept;

public class MobilePrepaidTest {

    public static void clickOnMobileRecharge(){
        System.out.println("Clicked on Mobile Prepaid");
    }

    public static void main(String[] args){

        AmazonPayBaseClass apb = new AmazonPayBaseClass();

        apb.openAmazonApp(); // Method Calling -> Object_name.methodName();
        apb.clickOnAmazonPay();
        clickOnMobileRecharge();
        apb.fetchTitle("Electricity");


    }

}
