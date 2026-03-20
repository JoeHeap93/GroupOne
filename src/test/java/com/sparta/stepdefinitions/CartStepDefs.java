package com.sparta.stepdefinitions;

import com.sparta.pages.CartPage;
import com.sparta.pages.HomePage;
import com.sparta.pages.LoginPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Managed;

public class CartStepDefs {
@Managed
private LoginPage loginPage;
private HomePage homePage;
private CartPage cartPage;


    @Then("I click on the product page")
    public void iClickOnTheProductPage() {

    }

    @Then("I add an item to cart")
    public void iAddAnItemToCart() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



    @Given("I am on the Home page")
    public void iAmOnTheHomePage() {
        cartPage.open();
    }

}
