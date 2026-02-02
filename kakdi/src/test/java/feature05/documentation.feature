#Author: your.email@your.domain.com
@tag
Feature: cucumber.io documentation page testing
 
  Background:
  Given the user must be in chrome browser
  
  @tag1
  Scenario: Verify the documentation
    Given The user is in cucumberio home page
    When The user clicks on documentation link
    Then The user can view the page content with what