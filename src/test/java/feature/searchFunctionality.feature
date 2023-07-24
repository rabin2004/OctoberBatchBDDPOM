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

@Release1.0
Feature: Search Functionality
Customer will be able to find product using this feature

#Scenario: Positive search funtionality test by click submit button
#Given customer is in homepage
#When customer enter valid product
#And clicks search button
#Then customer should be able to see search related items
#
#Scenario: Positive search funtionality test by hitting enter key
#Given customer is in homepage
#When customer enter valid product
#And hits enter key
#Then customer should be able to see search related items
#
#Scenario: Negative search funtionality test by click submit button
#Given customer is in homepage
#When customer enter invalid product
#And clicks search button
#Then customer should see no result error message

@Regression @E2E @PositiveScenario
Scenario Outline: Positive search funtionality data driven
Given customer is in homepage
When customer enter valid "<product>"
And clicks search button
Then customer should be able to see "<product>" related items

Examples:
|product|
|samsung|
|apple|
|pixel|

@Regression @E2E @NegativeScenario
Scenario Outline: Negative search funtionality test data driven
Given customer is in homepage
When customer enter invalid "<invalidProduct>"
And clicks search button
Then customer should see no result error message for invalid "<invalidProduct>"

Examples:
|invalidProduct|
|@(*&@*$#@#&*(&*23482394823481|
|@(*&@*$#@#&*(&*23482394823482|
|@(*&@*$#@#&*(&*23482394823483|


