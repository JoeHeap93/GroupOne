package com.sparta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

@DefaultUrl("https://automationexercise.com/signup")
public class SignupPage extends PageObject {
    @FindBy(id="id_gender1")
    private WebElementFacade selectGender;
    @FindBy(id="password")
    private WebElementFacade passwordField;
    @FindBy(id="days")
    private WebElementFacade daysDropDown;
    @FindBy(id="months")
    private WebElementFacade monthsDropDown;
    @FindBy(id="years")
    private WebElementFacade yearsDropDown;
    @FindBy(id="first_name")
    private WebElementFacade firstNameField;
    @FindBy(id="last_name")
    private WebElementFacade lastNameField;
    @FindBy(id="address1")
    private WebElementFacade addressField;
    @FindBy(id="state")
    private WebElementFacade stateField;
    @FindBy(id="city")
    private WebElementFacade cityField;
    @FindBy(id="zipcode")
    private WebElementFacade zipcodeField;
    @FindBy(id="mobile_number")
    private WebElementFacade mobileField;
    @FindBy(xpath = "//button[contains(.,'Create Account')]")
    private WebElementFacade createAccountButton;
    @FindBy(xpath = "//button[contains(.,'Continue')]")
    private WebElementFacade continueButton;
    @FindBy(linkText ="Delete Account")
    private WebElementFacade deleteAccountButton;

    public void selectMale(){
        selectGender.click();
    }

    public void enterPassword(String password){
        passwordField.type(password);
    }

    public void selectDays(String days){
        daysDropDown.click();
        daysDropDown.selectByVisibleText(days);
    }

    public void selectMonths(String month){
        monthsDropDown.click();
        monthsDropDown.selectByVisibleText(month);
    }

    public void selectYears(String year){
        yearsDropDown.click();
        yearsDropDown.selectByVisibleText(year);
    }

    public void enterFirstName(String firstname){
        firstNameField.click();
        firstNameField.type(firstname);
    }

    public void enterLastName(String lastname){
        lastNameField.type(lastname);
    }

    public void enterAddress(String address){
        addressField.type(address);
    }

    public void enterState(String state){
        stateField.type(state);
    }

    public void enterCity(String city){
        cityField.type(city);
    }

    public void enterZipcode(String zip){
        zipcodeField.type(zip);
    }

    public void enterMobile(String mobile){
        mobileField.type(mobile);
    }

    public void clickCreateAccountButton() {
        createAccountButton.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickDeleteAccountButton() {
        deleteAccountButton.click();
    }


}
