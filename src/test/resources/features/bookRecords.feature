Feature: 
  Scenario:
    Given the user login as a "librarian"
    When the user should click the bookButton
    And the user should see default ten records
    Then the page show records following options

      |5      |
      |10     |
      |15     |
      |50     |
      |100    |
      |200    |
      |500    |