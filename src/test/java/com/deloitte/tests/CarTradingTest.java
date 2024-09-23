package com.deloitte.tests;

import com.deloitte.steps.CarTradingSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class CarTradingTest {

    @Steps
    CarTradingSteps carTradingSteps;

    @Test
    public void buying_a_second_hand_car() {
        carTradingSteps.goToBuyCar();
        carTradingSteps.carMustBeOfBrand("Ford Motors");
        carTradingSteps.carMustBeWhiteInColor();
        carTradingSteps.searchForCar();
        carTradingSteps.selectCityAsTokyo();
    }
}
