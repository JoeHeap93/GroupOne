package com.sparta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.List;


@DefaultUrl("https://automationexercise.com/products")
public class ProductPage extends PageObject {

     //Product cards on the products page
    @FindBy(css = ".features_items .product-image-wrapper")
    private List<WebElementFacade> productItems;

    @FindBy(id = "search_product")
    private WebElementFacade searchInput;

    @FindBy(id = "submit_search")
    private WebElementFacade searchButton;

    @FindBy(css = ".choose a")
    private List<WebElementFacade> viewProductLinks;

    @FindBy(css = ".add-to-cart")
    private List<WebElementFacade> addToCartButtons;

    @FindBy(css = ".brands-name li a")
    private List<WebElementFacade> brandLinks;

    @FindBy(css = ".left-sidebar h2")
    private WebElementFacade brandSectionTitle;


    public int getNumberOfProducts() {
        return productItems.size();
    }

    public void searchForProduct(String productName) {
      searchInput.type(productName);
        searchButton.click();
    }

    public void clickViewProductByIndex(int index) {
        viewProductLinks.get(index).click();
    }

    public void addProductToCartByIndex(int index) {
        addToCartButtons.get(index).click();
    }

    public String getProductNameByIndex(int index) {
        return productItems.get(index)
                .thenFind(".productinfo p").getText();
    }

    public void clickBrandByIndex(int index) {
        brandLinks.get(index).click();
    }

    public void clickBrandByName(String brandName) {
        for (WebElementFacade brand : brandLinks) {
            if (brand.getText().equalsIgnoreCase(brandName)) {
                brand.click();
                break;
            }
        }
    }

    public boolean isBrandSectionVisible() {
        return brandSectionTitle.isDisplayed();
    }

}



