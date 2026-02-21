package org.example.javabasic.oopsConcept.realTimeIsUsed;

public class MobileRechargeDesktop implements MobileRechargeInterface{

    @Override
    public void openAmazon() {
       System.out.println("Opening Amazon in Desktop");
    }

    @Override
    public void openAmazonPay() {
       System.out.println("Opening Amazon Pay on Desktop");
    }

    @Override
    public void openMobileRecharge() {
        System.out.println("Opening Mobile recharge on desktop");
    }
}
