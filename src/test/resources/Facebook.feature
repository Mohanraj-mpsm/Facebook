Feature: User Account Creation on Facebook



Background:
Given Launching the website through url "https://www.facebook.com"
When Sign up page appeared after clicking Create new account button


Scenario Outline: Create new account in Facebook
Given User enters the first name "<FirstName>"
And User enters the surname "<SurName>"
When Mobile Number or Email address is entered "<Mob>"
And Password is entered "<Password>"
Then Date of birth is selected "<YearOfBirth>"
And Gender is selected
And SignUp button is clicked for account creation 

Examples:
|FirstName|SurName|Mob|Password|YearOfBirth|
|mohan|ra|4856978523|T4@ewrgh|1995|
|rak|mohi|5263214859|JH3@hko|1994|
|mee|mee|5697852365|JUio9&t|1993|
