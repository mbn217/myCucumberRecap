Feature: Search functionality

Background: user is on the amzon page
	Given user navigate to amazon.com
	And user is on the home page 
	And user select the search bar


  Scenario: Search for an Iphone "11"
	When user enter iphone 11 
	Then the results should be displayed
    

  Scenario: Search for an Iphone "12"
	When user enter iphone 12 
	Then the results should be displayed