Feature: Register

  In order to be able to buy items
  As a new user of the Automation Exercise website
  I want to be able to register an account

  @Happy
  Scenario: Register with my details
    Given I am on the login page
    And I have clicked the consent button
    And I have entered the name "Test 4"
    And I have entered the signup email "heap12347@gmail.com"
    When I click the signup button
    Then I should land on the signup page
    And I have clicked the gender selection
    And I have entered the signup password "secret123"
    And I have entered my day date of birth "3"
    And I have entered the month of birth "January"
    And I have entered the year of birth "1993"
    And I have entered the first name "Joe"
    And I have entered the last name "Heap"
    And I have entered the address "2 Test Lane"
    And I have entered the state "State"
    And I have entered the city "City"
    And I have entered the zipcode "12345"
    And I have entered the mobile number "07615432102"
    And I have clicked create account
    Then I should land on the account created page
    And I click the continue button
    And I click the delete account button
    Then I am on the delete account page
