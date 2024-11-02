Feature: Add to Cart and Checkout Feature

  Scenario: Add two products to the cart and proceed to checkout
    Given User is logged in
    When User adds two products to the cart
    And User goes to the cart and proceeds to checkout
    And User enters valid checkout details
    Then Checkout is completed successfully

  Scenario: Checkout with missing details
    Given User is logged in
    When User adds two products to the cart
    And User goes to the cart and proceeds to checkout
    And User enters empty first name
    Then Error message First Name is required is displayed