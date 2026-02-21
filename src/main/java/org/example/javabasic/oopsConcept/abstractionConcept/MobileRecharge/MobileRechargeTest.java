package org.example.javabasic.oopsConcept.abstractionConcept.MobileRecharge;

public class MobileRechargeTest {

    public static void main(String[] args){

            MobileRechargeAndroid android = new MobileRechargeAndroid();
            android.openAmazon();
            android.clickOnAmazonPay();
            android.clickOnMobileRecharge();
            android.verifyTitle();


    }
}
