Feature: Checking the booking functionality of adactin application
Scenario Outline: Login functionality
Given user must launch URL
When User enter the "<username>" in the username field
And user enter the "<password>" in the password field
Then user click the login button an it navigates to the search hotel page

Examples:
|username|password|
|abc|123|
|xyz|456|
|Darkknight|B721CQ|


Scenario: Hotel Selection
When user select the locaion "Los Angeles" in location