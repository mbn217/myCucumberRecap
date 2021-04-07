Feature: Search functionality

  Scenario: Search for an Iphone "11"
    Given user is on the amazon home page
    When user search for an iphone "11"
    Then the result page should be displayed
    

  Scenario: Search for an Iphone "12"
    Given user is on the amazon home page
    When user search for an iphone "12"
    Then the result page should be displayed