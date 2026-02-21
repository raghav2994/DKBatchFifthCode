package org.example.javabasic.oopsConcept.realTimeIsUsed;

public class MobileRechargeTest {

    public static void  main(String[] args){

        MobileRechargeDesktop desktop = new MobileRechargeDesktop();

        MobileRechargeInterface desktopOne = new MobileRechargeDesktop();

        desktopOne.openAmazon();

        desktop.openAmazonPay(); //
        desktop.openMobileRecharge();

    }
}
