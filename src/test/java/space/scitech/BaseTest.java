package test.java.space.scitech;


import main.java.space.scitech.pageobjects.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.space.scitech.configuration.Config;
import test.java.space.scitech.configuration.ConfigReader;
import test.java.space.scitech.configuration.TestUser;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


/**
 * UI tests for cobra app
 */
public class BaseTest
{
    protected Config config = ConfigReader.getConfig();

    @Test
    public void loginTest() {
        //Load the site and click the login button
        String targetUrl = config.getStart_url();

        //Load the site and click the login button, if displayed
        open(targetUrl);
        if(!webdriver().driver().url().contains("sign-in=modal")){
            $(LandingPage.loginInButton()).click();
        }

        TestUser user = config.getTestUsers().get(0);

        //Enter the email and password
        $(LandingPage.loginEmailInput()).setValue(user.getUsername());
        $(LandingPage.loginPasswordInput()).setValue(user.getPassword());
        $(LandingPage.submitInButton()).click();

        //Check that the deposit button is displayed and click it
        $(LandingPage.depositButton()).shouldBe(visible).click();
        $(LandingPage.paymentMethodsSelector()).shouldBe(visible);

        List<String> paymentMethodIds = $$(LandingPage.paymentMethodsSelector())
                .stream()
                .map(element -> element.getAttribute("data-method-id"))
                .toList();
        Assert.assertEquals(paymentMethodIds, user.getPayment_methods(), "Payment methods are not as expected");

    }
}
