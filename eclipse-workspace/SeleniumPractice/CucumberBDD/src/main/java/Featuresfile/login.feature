Feature: Free CRM Login Feature

  Scenario: Free CRM Login Test Scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
    And user clicks on login button
    Then user is on home page
    And Close the browser 
      
