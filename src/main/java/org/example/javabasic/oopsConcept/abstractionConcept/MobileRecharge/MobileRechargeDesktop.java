package org.example.javabasic.oopsConcept.abstractionConcept.MobileRecharge;

public class MobileRechargeDesktop implements MobileRechargeInterface{


    @Override
    public void openAmazon() {
        System.out.println("Opening Amazon on Desktop");
    }

    @Override
    public void clickOnAmazonPay() {
        System.out.println("Opening Amazon Pay on Desktop");

    }

    @Override
    public void clickOnMobileRecharge() {
        System.out.println("Clicking on Mobile Recharge on Desktop");

    }

    @Override
    public void verifyTitle() {
        System.out.println("Verifying title on Desktop for mobile recharge");

    }

    @Override
    public void selectPlan() {

    }

}
