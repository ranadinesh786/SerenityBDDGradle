package com.deloitte.steps;

import net.thucydides.core.annotations.Step;

public class CarTradingSteps {

    @Step("Go to buy car")
    public void goToBuyCar() {
        System.out.println("I go to buy car");
    }

    @Step("Car must be of {0}")
    public void carMustBeOfBrand(String brand) {
        System.out.println("Car must be of " + brand);
    }

    @Step("Car must be white in color")
    public void carMustBeWhiteInColor() {
        System.out.println("Car must be white in color");
    }

    @Step("Search for car")
    public void searchForCar() {
        System.out.println("I search for car");
    }

    @Step("Select City as Tokyo")
    public void selectCityAsTokyo() {
        System.out.println("I select City as Tokyo");
    }
}
