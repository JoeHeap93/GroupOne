Feature: Product

Feature: Browse products and filter by brand
As a user
I want to view products and filter them by brand
So that I can easily find items from brands I like

  Background:
    Given I am on the Product page

  @happyPath
  Scenario: User successfully searches, views, and filters products by brand
    When I search for a product with name "dress"
    Then I should see at least 1 product in the results

    When I view the first product in the results
    Then the product details page should be displayed

    When I navigate back to the Product page
    Then the brand section should be visible
    And I should see a list of product brands

    When I click the brand "Polo"
    Then I should see products filtered by the brand "Polo"