package org.example.javabasic.realtimeusecase;

public class FlightCategoryAutomation {

    static String amazonUrl = "Amazon URL";
    static  String amazonPayTile = "Amazon Pay Tile";
    static  String flightCategory = "Flight Category";
    static String flightPageTitle;

public static void main(String[] args){
    automatingUseCase();
    openingAmazonPage();
}

public static void automatingUseCase(){
    openingAmazonPage();
    clickingOnAmazonPayTile();
    clickingOFlightCategoryTile();
    fetchingFlightPageTitle();
}
    public static void openingAmazonPage(){
        System.out.println("Opening Amazon Page " + amazonUrl);

    }

    public static void clickingOnAmazonPayTile(){
        System.out.println("Clicking Amazon Pay Tile " + amazonPayTile);
    }

    public static void clickingOFlightCategoryTile(){
        System.out.println("Clicking Flight Category Tile " + flightCategory);
    }

    public static void fetchingFlightPageTitle(){
        openingAmazonPage();
        flightPageTitle = "Flights";
        System.out.println("Title of the Flight Page is " + flightPageTitle);
    }


}
