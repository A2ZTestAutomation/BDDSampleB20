Feature: CRM Login Feature

#Scenario: Valid Login
#Given User is on Login page
#When User enters login credentials
#Then User is on Home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User is on Home page

#Scenario Outline: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then User is on Home page
#
#Examples:
#	| username | password |
#	| testuser1 | welcome123 |
#	| testuser2 | welcome123 |
#	| tomsmith | SuperSecretPassword! |
	

Scenario: Valid Login
Given User is on Login page
When User enters login credentials
	| username | password |
	| tomsmith | SuperSecretPassword! |
Then User is on Home page

#Scenario: create a Contact
#Given User is on login page
#And User loggedIn
#	"tomsmith"  "SuperSecretPassword!"
#And User navigate to contact page
#When User Enters contact details
#	firstname, lastname, address...
#	