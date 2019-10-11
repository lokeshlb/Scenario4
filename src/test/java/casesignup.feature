Feature: Casestudy scenario1
Scenario: Sign up Process

Given Open browser and proceed to TestMe App
When Enters User Name as "balaji071"
And  Enters First Name as "lokesh"
And Enters Last Name as "balaji"
And Enters Password as "Dhoni07@"
And Enters Confirm Password as "Dhoni07@"
And Select gender as "Male"
And Enters E -Mail as "lokeshbalaji1998@gmail.com"
And Enters Mobile Number as "8608465496"
And Enters DOB as "21/06/1998"
And Enters Address as "YYYYjjjhfhff"
And Enters Answer as "on earth"
And  click on login button
Then Check if TestMe App login page is displayed

