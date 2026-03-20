package com.sparta.stepdefinitions;

import com.sparta.pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class LoginStepDefs {
    @Managed
    private LoginPage loginPage;


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.open();
    }

    @And("I have entered the email {string}")
    public void iHaveEnteredTheEmail(String email) {
        loginPage.enterEmail(email);
    }

    @And("I have entered the password {string}")
    public void iHaveEnteredThePassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should land on the home page")
    public void iShouldLandOnTheHomePage() throws InterruptedException {
        Thread.sleep(5000);
        MatcherAssert.assertThat(loginPage.getDriver().getCurrentUrl(), Matchers.is("https://automationexercise.com/"));
    }

    @And("I have clicked the consent button")
    public void iHaveClickedTheConsentButton() {
        loginPage.clickConsentButton();
    }

    @When("I click the logout button")
    public void iClickTheLogoutButton() {
        loginPage.clickLogoutButton();
    }

    @Then("I should land on the login page")
    public void iShouldLandOnTheLoginPage() throws InterruptedException {
        Thread.sleep(5000);
        MatcherAssert.assertThat(loginPage.getDriver().getCurrentUrl(), Matchers.is("https://automationexercise.com/login"));
    }
}
