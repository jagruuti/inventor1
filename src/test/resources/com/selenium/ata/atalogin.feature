#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#It’s not necessary that all the scenarios have all these keywords 
# ‘given’, ‘when’, ‘then’ and ‘and’. 
#You can write scenarios where you can use only one keyword in all the steps.
#For example,
#the below scenario which only uses Given keyword is perfectly valid
#Scenario: Check that main elements on Google Homepage are displayed
#Given I launch Chrome browser
#Given I open Google Homepage
#Given I verify that the page displays search text box
#Given the page displays Google Search button
#Given the page displays Im Feeling Lucky button
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
@Login
Feature: Logging into CTHackATAhon

  @Login
  Scenario Outline: Logging into CTHackATAhon
    Given I open <Browser>
    And I go to loginURL
    
    
    Examples: 
      |Browser |   Result     |
      |chrome  |   success    |
      