Feature: Cucumber scenario2
Scenario Outline: Login
Given open TestMeApp and click Signin
When user performs login using "<username>" and "<password>"
Then logged in Successfully
Examples: 
|username| |password|
|lalitha| |Password123|