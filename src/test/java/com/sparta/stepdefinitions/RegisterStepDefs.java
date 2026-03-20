package com.sparta.stepdefinitions;

import com.sparta.pages.LoginPage;
import com.sparta.pages.SignupPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class RegisterStepDefs {
    @Managed
    private LoginPage loginPage;
    private SignupPage signupPage;

    @And("I have entered the name {string}")
    public void iHaveEnteredTheName(String name) {
        loginPage.enterName(name);
    }

    @And("I have entered the signup email {string}")
    public void iHaveEnteredTheSignupEmail(String email) {
        loginPage.enterSignupEmail(email);
    }

    @When("I click the signup button")
    public void iClickTheSignupButton() {
        loginPage.clickSignupButton();
    }

    @Then("I should land on the signup page")
    public void iShouldLandOnTheSignupPage() throws InterruptedException {
        Thread.sleep(5000);
        MatcherAssert.assertThat(signupPage.getDriver().getCurrentUrl(), Matchers.is("https://automationexercise.com/signup"));
    }
}
