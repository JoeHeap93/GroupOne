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

    @And("I have clicked the gender selection")
    public void iHaveClickedTheGenderSelection() {
        signupPage.selectMale();
    }

    @And("I have entered the signup password {string}")
    public void iHaveEnteredTheSignupPassword(String password) {
        signupPage.enterPassword(password);
    }

    @And("I have entered my day date of birth {string}")
    public void iHaveEnteredMyDayDateOfBirth(String day) {
        signupPage.selectDays(day);
    }

    @And("I have entered the month of birth {string}")
    public void iHaveEnteredTheMonthOfBirth(String month) {
        signupPage.selectMonths(month);
    }

    @And("I have entered the year of birth {string}")
    public void iHaveEnteredTheYearOfBirth(String year) {
        signupPage.selectYears(year);
    }

    @And("I have entered the first name {string}")
    public void iHaveEnteredTheFirstName(String firstname) {
        signupPage.enterFirstName(firstname);
    }

    @And("I have entered the last name {string}")
    public void iHaveEnteredTheLastName(String lastname) {
        signupPage.enterLastName(lastname);
    }

    @And("I have entered the address {string}")
    public void iHaveEnteredTheAddress(String address) {
        signupPage.enterAddress(address);
    }

    @And("I have entered the state {string}")
    public void iHaveEnteredTheState(String state) {
        signupPage.enterState(state);
    }

    @And("I have entered the city {string}")
    public void iHaveEnteredTheCity(String city) {
        signupPage.enterCity(city);
    }

    @And("I have entered the zipcode {string}")
    public void iHaveEnteredTheZipcode(String zipcode) {
        signupPage.enterZipcode(zipcode);
    }

    @And("I have entered the mobile number {string}")
    public void iHaveEnteredTheMobileNumber(String mobile) {
        signupPage.enterMobile(mobile);
    }

    @And("I have clicked create account")
    public void iHaveClickedCreateAccount() throws InterruptedException {
        Thread.sleep(5000);
        signupPage.clickCreateAccountButton();
        Thread.sleep(5000);
    }

    @Then("I should land on the account created page")
    public void iShouldLandOnTheAccountCreatedPage() throws InterruptedException {
        Thread.sleep(5000);
        MatcherAssert.assertThat(signupPage.getDriver().getCurrentUrl(), Matchers.is("https://automationexercise.com/account_created"));
    }

    @And("I click the continue button")
    public void iClickTheContinueButton() {
        signupPage.clickContinueButton();
    }

    @And("I click the delete account button")
    public void iClickTheDeleteAccountButton() {
        signupPage.clickDeleteAccountButton();
    }

    @Then("I am on the delete account page")
    public void iAmOnTheDeleteAccountPage() throws InterruptedException {
        Thread.sleep(5000);
        MatcherAssert.assertThat(signupPage.getDriver().getCurrentUrl(), Matchers.is("https://automationexercise.com/delete_account"));
    }
}
