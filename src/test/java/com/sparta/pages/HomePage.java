package com.sparta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;


@DefaultUrl("https://automationexercise.com")
public class HomePage extends PageObject {

    //go to product page
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[@href='/products' and contains(., 'Products')]")
    private WebElementFacade productsLink;


    public void goToProducts() {
        productsLink.click();
    }


    // CATEGORY header on the home page
    @FindBy(xpath = "//h2[text()='Category']")
    private WebElementFacade categoryHeader;

    public WebElementFacade getCategoryHeader() {
        return categoryHeader;
    }



}