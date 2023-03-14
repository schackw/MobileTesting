Feature: I as user want to log in in my app

  Scenario: Try to log in with incorrect credentials
    Given I want to log in
    When I enter incorrect credentials
    Then I will see that i cant log in