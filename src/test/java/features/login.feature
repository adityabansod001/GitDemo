Feature: Login into Application
Scenario: Positive Test validating log in 
Given Initialize Chrome browser
And Navigate to "http://www.qaclickacademy.com/"
And click log in and land on loginPage
When User enters "Username" and "Password" and logs in
Then Verify that user is loged in

