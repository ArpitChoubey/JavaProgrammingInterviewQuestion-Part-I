Feature: E-Commerce Website Purchase Feature

  Scenario: E-Commerce Product Purchase Test Scenario
    @smoke
    Given user is already on E-Commerce Login Page
    When title of login page is "E-Shop"
    Then user enters valid username and password
    And user clicks on login button
    Then user is navigated to the home page
    When user searches for a product "Laptop"
    And user selects the product from search results
    Then user adds the product to the cart
    And user proceeds to checkout
    Then user enters shipping and payment details
    And user confirms the order
    Then user sees order confirmation message
    And Close the browser
    
    Scenario: Add product to Wishlist
    @regression
    Given user is already on E-Commerce Login Page
    When title of login page is "E-Shop"
    Then user enters valid username and password
    And user clicks on login button
    Then user is navigated to the home page
    When user searches for a product "Smartphone"
    And user selects the product from search results
    Then user adds the product to the Wishlist
    And user navigates to Wishlist page
    Then user sees the product added in Wishlist
    And Close the browser
    
    
    
    
    Scenario: Invalid Login Attempt
    @negative
    Given user is already on E-Commerce Login Page
    When title of login page is "E-Shop"
    Then user enters invalid username and password
    And user clicks on login button
    Then user should see error message "Invalid credentials"
    And user remains on login page
    And Close the browser
    
    
    
    Scenario: View Order History
    @regression
    Given user is already on E-Commerce Login Page
    When title of login page is "E-Shop"
    Then user enters valid username and password
    And user clicks on login button
    Then user is navigated to the home page
    When user navigates to "My Orders" section
    Then user sees list of previous orders
    And user selects a past order to view details
    Then order details should be displayed
    And Close the browser