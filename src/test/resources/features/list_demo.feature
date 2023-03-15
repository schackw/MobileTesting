Feature: I as user want to check a value in the list demo

  Scenario Outline: I as user want to choise a value in the list
    Given The user need be in the list section
    When The user look for a "<clouds>" in the list
    Then The user will check the cloud that he look before
    Examples:
      | clouds |
      | Fog    |