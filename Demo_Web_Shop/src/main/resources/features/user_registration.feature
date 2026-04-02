Feature: verify  User Registration

Scenario: verify Registration with new user
Given launch demo shop
When user should click on register in navbar
And user enters details
And enter email and password
And user clicks Register button
Then registration should be successful
