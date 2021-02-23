Feature: Add new users
  Scenario: : librarian can add new users info
    Given the user login as a "librarian"
    When the user add new information of the new user
    And the user able to save changes
    Then the user able to edit info
