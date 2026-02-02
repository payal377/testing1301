#Author: your.email@your.domain.com
@tag
Feature: bookswagon com page testing
 
  Background:
  Given the user must be in chrome browser
  
  @tag1
  Scenario: Sign up 
    Given The user is in bookswagon com sign up page
    When The user enter correct details
    Then The user can continue in the page
    
    
    Examples: 
      | name  | phone no.  | status  |
      | anuj  | 9310143352 | Pass    |
      | amann | 7983104335 | Fail    |
      | aryan | 8267356490 | Fail    |