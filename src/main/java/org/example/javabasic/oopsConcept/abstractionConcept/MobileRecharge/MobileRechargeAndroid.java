package org.example.javabasic.oopsConcept.abstractionConcept.MobileRecharge;

public class MobileRechargeAndroid implements MobileRechargeInterface{
    @Override
    public void openAmazon() {
        System.out.println("Opening Amazon on Android");

    }

    @Override
    public void clickOnAmazonPay() {
        System.out.println("Opening Amazon Pay on Android");

    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge on Android");

    }

    @Override
    public void verifyTitle() {
        System.out.println("Verifying title on Android for mobile recharge");

    }

    @Override
    public void selectPlan() {
        System.out.println("selecting the plan");
    }
}
