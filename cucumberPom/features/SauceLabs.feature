
Feature: To validate the login page


  Scenario Outline: To validate the login functionality
    Given user launch the application with "<url>"
    When user enter the valid username "<username>"
    And user enter valid password "<password>"
    And user click on submit button
    Then user should be able to logged in successfully
   

    Examples: 
      |url|username|password|
      |https://www.saucedemo.com/|standard_user|secret_sauce|
      |https://www.saucedemo.com/|problem_user|secret_sauce|
      |https://www.saucedemo.com/|performance_glitch_user|secret_sauce|

  Scenario Outline: To validate login functionality for invalid creds
    Given user launch the application with "<url>"
    When user enter the invalid username "<username>"  
    And user enter  the invalid password "<password>"
    And user click the submit button
    Then user should see some error msg
    
  Examples:
    |url|username|password|
      | https://www.saucedemo.com/ | standard_user |mayur_abc |
      | https://www.saucedemo.com/ | gadde_abc |  secret_sauce  |
      | https://www.saucedemo.com/ | musername | dpassword  |
      