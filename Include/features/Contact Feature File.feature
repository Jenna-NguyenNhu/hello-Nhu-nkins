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
@tag
Feature: I want to contact with the site
  I want to send a message to 'nguoiyeudep' site
  @tag1
  Scenario Outline: I can send a message to 'nguoiyeudep' site
    Given I am on 'nguoiyeudep' page
    When I click Sign in with messenger
    And I enter email '0962973782'
    And I enter password 'Nhung@2612'
    And I click Sign in button
    And I input message 'Nhu ne'
    Then I click Send button
    

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
      
