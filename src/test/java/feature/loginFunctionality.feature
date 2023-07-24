#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@Release2.0
Feature: Login Functionality
Valid customer should be able to login providing valid credentials.

@Regression @NegativeScenario
Scenario Outline:
Given customer is in sign in page
When enter invalid "<username>"
And clicks continue button
And enters invalid "<password>"
And clicks sign-in button
Then login should fail with error message

Examples:
|username|password|
|test@gmail.com|test12|
|test12@gmail.com|test123|
