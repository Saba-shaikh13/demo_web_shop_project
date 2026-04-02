Feature:  verify login functionality 

Scenario:  verify Login with valid credentials

Given user launch demo shop website
When user click on login  in navbar
And  user enters valid email and password
And user click on login button
Then user should login successfully