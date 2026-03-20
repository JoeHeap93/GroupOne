import com.sparta.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ProductStepdefs {

    @Managed
    ProductPage productPage;

    @Given("I am on the Product page")
    public void iAmOnTheProductPage() {
        productPage.open();
    }

    @When("I search for a product with name {string}")
    public void i_search_for_a_product_with_name(String productName) {
        productPage.searchForProduct(productName);
    }

    @Then("I should see at least 1 product in the results")
    public void i_should_see_at_least_1_product_in_the_results() {
        assertThat(productPage.getNumberOfProducts())
                .as("Expected at least 1 product after search")
                .isGreaterThan(0);
    }

    @When("I view the first product in the results")
    public void i_view_the_first_product_in_the_results() {
        productPage.clickViewProductByIndex(0);
    }

    @Then("the product details page should be displayed")
    public void the_product_details_page_should_be_displayed() {
        // product name must exist on the detail page
        String title = productPage.getTitle();
        assertThat(title).containsIgnoringCase("Product Details");
    }

    @When("I navigate back to the Product page")
    public void i_navigate_back_to_the_product_page() {
        productPage.open();
    }

    @Then("the brand section should be visible")
    public void the_brand_section_should_be_visible() {
        assertThat(productPage.isBrandSectionVisible())
                .as("Brand section should be visible")
                .isTrue();
    }

    @Then("I should see a list of product brands")
    public void i_should_see_a_list_of_product_brands() {
        assertThat(productPage.hasBrands())
                .as("Expected list of brands to be non-empty")
                .isTrue();
    }

    @When("I click the brand {string}")
    public void i_click_the_brand(String brandName) {
        productPage.clickBrandByName(brandName);
    }

    @Then("I should see products filtered by the brand {string}")
    public void i_should_see_products_filtered_by_the_brand(String brandName) {
        // Verify the page heading contains the brand name
        String pageTitle = productPage.getTitle();
        assertThat(pageTitle)
                .as("Expected brand name in page title")
                .containsIgnoringCase(brandName);
    }
}


        















//
//public class HappyPathStepDefinitions {
//
//    @Steps
//    ProductPage productPage;
//
//    // ---------------- BACKGROUND ----------------
//
//    @Given("I am on the Product page")
//    public void i_am_on_the_product_page() {
//        productPage.open();
//    }
//
//    // ---------------- SEARCH ----------------
//
//    @When("I search for a product with name {string}")
//    public void i_search_for_a_product_with_name(String productName) {
//        productPage.searchForProduct(productName);
//    }
//
//    @Then("I should see at least 1 product in the results")
//    public void i_should_see_at_least_1_product_in_the_results() {
//        assertThat(productPage.getNumberOfProducts())
//                .as("Expected at least 1 product after search")
//                .isGreaterThan(0);
//    }
//
//    // ---------------- VIEW PRODUCT ----------------
//
//    @When("I view the first product in the results")
//    public void i_view_the_first_product_in_the_results() {
//        productPage.clickViewProductByIndex(0);
//    }
//
//    @Then("the product details page should be displayed")
//    public void the_product_details_page_should_be_displayed() {
//        // product name must exist on the detail page
//        String title = productPage.getTitle();
//        assertThat(title).containsIgnoringCase("Product Details");
//    }
//
//    // ---------------- BRAND SECTION ----------------
//
//    @When("I navigate back to the Product page")
//    public void i_navigate_back_to_the_product_page() {
//        productPage.open();
//    }
//
//    @Then("the brand section should be visible")
//    public void the_brand_section_should_be_visible() {
//        assertThat(productPage.isBrandSectionVisible())
//                .as("Brand section should be visible")
//                .isTrue();
//    }
//
//    @Then("I should see a list of product brands")
//    public void i_should_see_a_list_of_product_brands() {
//        assertThat(productPage.getBrandNames().size())
//                .as("Expected list of brands to be non-empty")
//                .isGreaterThan(0);
//    }
//
//    @When("I click the brand {string}")
//    public void i_click_the_brand(String brandName) {
//        productPage.clickBrandByName(brandName);
//    }
//
//    @Then("I should see products filtered by the brand {string}")
//    public void i_should_see_products_filtered_by_the_brand(String brandName) {
//        // Verify the page heading contains the brand name
//        String pageTitle = productPage.getTitle();
//        assertThat(pageTitle)
//                .as("Expected brand name in page title")
//                .containsIgnoringCase(brandName);
//    }
//}