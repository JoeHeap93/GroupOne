Feature: Register

  In order to be able to buy items
  As a new user of the Automation Exercise website
  I want to be able to register an account

  @Happy
  Scenario: Register with my details
    Given I am on the login page
    And I have clicked the consent button
    And I have entered the name "Test Name"
    And I have entered the signup email "test@test.com"
    When I click the signup button
    Then I should land on the signup page