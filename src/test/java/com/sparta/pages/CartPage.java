
package com.sparta.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://automationexercise.com/view_cart")
public class CartPage extends PageObject {

    // Proceed to checkout button
    @FindBy(css = "a.btn.btn-default.check_out")
    private WebElementFacade checkOutButton;


    // Home
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[@href='/' and contains(., 'Home')]")
    private WebElementFacade homeLink;


    // Remove ANY item (first match)
    @FindBy(css = "a.cart_quantity_delete")
    private WebElementFacade removeFromCartButton;



    /**
     * Click the checkout button.
     */
    public void clickCheckOutButton() {
        checkOutButton.click();
    }

    /**
     * Remove a cart item using its product ID.
     * Example product ID: "1", "2", "3"
     */
    public void removeItemByProductId(String productId) {
        WebElementFacade removeFromCartButton = find(
                By.cssSelector("a.cart_quantity_delete[data-product-id='" + productId + "']")
        );
        removeFromCartButton.waitUntilClickable().click();
    }

    /**
     * Removes the first available item in the cart.
     * Useful for single-item carts.
     */
    public void removeFirstItem() {
        WebElementFacade deleteButton = find(By.cssSelector("a.cart_quantity_delete"));
        deleteButton.waitUntilClickable().click();
    }

    /**
     * Removes all items from the cart.
     * Loops until no more delete buttons remain.
     */
    public void removeAllItems() {
        while (!findAll("a.cart_quantity_delete").isEmpty()) {
            find("a.cart_quantity_delete").click();
            waitABit(300); // allow DOM to update after removal
        }
    }


    public void goToHome() {
        homeLink.click();
    }

}
