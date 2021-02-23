Feature: Student and Librarian Several Modules
  Scenario Outline: Student and librarian should have access different modules
    When the user login as a "<username>" "<password>"
    Then the modules contains "<modules>"

    Examples:
      | username           |password        |           modules          |
      |student11@library   |tScBPCUr        | Books - Borrowing Books    |
      |librarian13@library |9rf6axdD        |Dashboard - Users - Books   |