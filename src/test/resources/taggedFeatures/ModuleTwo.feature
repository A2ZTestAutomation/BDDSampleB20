@PhaseTwo
Feature: CRM Tasks Features

Background: User Login
Given User is loggedIn

@RegressionTest
Scenario: Create Tasks
When User create a new Tasks

Scenario: View Tasks
When User view Tasks details

@SmokeTest
Scenario: Update Tasks
When User update a Tasks details
