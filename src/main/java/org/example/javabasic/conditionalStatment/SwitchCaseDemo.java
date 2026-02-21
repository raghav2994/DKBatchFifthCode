package org.example.javabasic.conditionalStatment;

public class SwitchCaseDemo {

    public static void main(String[] args){
        //chooseMonth(1);
         chooseBrowser("chrome");
    }

    public static void chooseBrowser(String browserName){

        switch(browserName)
        {
            case "chrome": {
                System.out.println("Chrome is getting opened");
                break;
            }

            case "firefox": {
                System.out.println("Firefox is getting opened");
                break;
            }

            default: {
                System.out.println("Browser does not exsist");
                break;
            }
        }
    }

    public static void chooseMonth(int n){

        switch(n)
        {
            case 1: {
                System.out.println("January");
                break;
            }

            case 2: {
                System.out.println("Feb");
                break;
            }

            default: {
                System.out.println("No month found");
                break;
            }
        }
    }
}
