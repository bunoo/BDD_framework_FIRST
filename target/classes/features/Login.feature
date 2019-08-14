Feature: FreeCRM login feature
Scenario: Validation of successful login

Given user is already on the Login Page
When title of the login page is correct
Then user enters the login credential
Then user clicks on Login button
And user is on Home Page