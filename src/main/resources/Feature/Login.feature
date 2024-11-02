Feature: Login Feature

  Scenario: Succeesful login
    Given I am on the saucedemo login page
    When I enter valid username and password
    Then I should be redirected to the products

    Scenario: Invalid login with incorrect password
      Given I am on saucedemo login page
      When User enters valid username and incorrect password
      Then Error message username and password do not match is displayed
