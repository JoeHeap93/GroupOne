package com.sparta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://automationexercise.com/login")
public class LoginPage extends PageObject {
    @FindBy(name="email")
    private WebElementFacade emailField;
    @FindBy(name="password")
    private WebElementFacade passwordField;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    private WebElementFacade loginButton;
    @FindBy(name="name")
    private WebElementFacade nameField;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    private WebElementFacade emailSignupField;
    @FindBy(xpath = "//button[contains(.,'Signup')]")
    private WebElementFacade signupButton;
    @FindBy(className = "fc-button-label")
    private WebElementFacade consentButton;
    @FindBy(linkText ="Logout")
    private WebElementFacade logoutButton;

    public void enterEmail(String username){
        emailField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickConsentButton() {consentButton.click();}

    public void enterName(String username){
        nameField.type(username);
    }

    public void enterSignupEmail(String password) {
        emailSignupField.type(password);
    }

    public void clickSignupButton() {
        signupButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
}
