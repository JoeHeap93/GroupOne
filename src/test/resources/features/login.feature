Feature: Login

  In order to be able to buy items
  As a registered user of the Automation Exercise website
  I want to be able to sign in to my account

  @Happy
  Scenario: Login with valid username and valid password then logout
    Given I am on the login page
    And I have clicked the consent button
    And I have entered the email "jheap@spartaglobal.com"
    And I have entered the password "secret_sauce"
    When I click the login button
    Then I should land on the home page
    When I click the logout button
    Then I should land on the login page