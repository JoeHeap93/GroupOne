package com.sparta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

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
    @FindBy(id="first-name")
    private WebElementFacade firstNameField;
    @FindBy(id="last-name")
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
    @FindBy(xpath = "//button[contains(.,'Create')]")
    private WebElementFacade createAccountButton;

    public void selectMale(){
        selectGender.click();
    }

    public void enterPassword(String password){
        passwordField.type(password);
    }

    public void selectDays(){
        daysDropDown.click();
    }

    public void selectMonths(){
        monthsDropDown.click();
    }

    public void selectYears(){
        yearsDropDown.click();
    }

    public void enterFirstName(String firstname){
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
}
