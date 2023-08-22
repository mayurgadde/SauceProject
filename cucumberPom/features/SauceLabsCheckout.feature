Feature: Checkout Feature

  Scenario: Validate checkout feature
    Given user launch the application
    When user enter username  as "standard_user" 
    And user enter password as "secret_sauce"
    And user click on login button
    Then user get name and price of first availaible item
    And user click on add to cart btn
    And user navigate to cart
    And user continue to checkout the item
    And user fill the details for delivery
    Then user verfiy the confirmation message
     