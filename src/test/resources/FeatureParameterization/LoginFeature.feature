Feature: 

  Scenario Outline: Login with Valid credential
    Given browser is open
    When user navigate to the website
    And user is on the login page
    And user enters username as "<username>" and password as "<password>"
    And click on Login button
    Then the register page is displayed

    Examples: 
      | username | password |
      | abc      |    12345 |
      | xyz      |    12345 |
      | mohamed  |    12345 |
