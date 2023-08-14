

Feature: Login
Scenario: Successful login with valid credentials
Given launch chromebrowser
When user open url
And  User enter email as "admin@yourstore.com" and password "admin"
And click on login button
Then page tittle should be"Dashboard / nopCommerce administration"
When User click on logout link
Then page tittle should be"Your store. Login"
And close browser

#Scenario Outline:Login Data Driven
#
#Given launch chromebrowser
#When user open url
#And  User enter email as "<email>" and password "<password>"
#And click on login button
#Then page tittle should be"Dashboard / nopCommerce administration"
#When User click on logout link
#Then page tittle should be"Your store. Login"
#And close browser
#
#Examples:
#|email|password|
#|admin@yourstore.com|admin|
#|admin@yourstore.com|admin123|

