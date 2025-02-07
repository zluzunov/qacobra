package main.java.space.scitech.pageobjects;

import org.openqa.selenium.By;

public class LandingPage {
    private LandingPage() {
    }

    public static By loginInButton(){
        return By.xpath("//header//a[contains(@href,'sign-in')]");
    }

    public static String loginEmailInput(){
        return "input[name='email']";
    }

    public static String loginPasswordInput(){
        return "input[name='password']";
    }

    public static By submitInButton(){
        return By.xpath("//div[@id='sign-in']//button[contains(@class,'login-form__submit-button')]");
    }

    public static By depositButton(){
        return By.xpath("//div[@id='modal-root']//a[contains(@class,'deposit-button')]");
    }

    public static By paymentMethodsSelector(){
        return By.xpath("//div[contains(@class,'spi-payment-methods-list__method')]");
    }

}
