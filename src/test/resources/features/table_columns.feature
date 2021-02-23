Feature: 
  Scenario:
    Given the user login as a new "Student"
    Then table should have following column names
    |Actions|
    |ISBN  |
    |Name  |
    |Author|
    |Category|
    |Year    |
    |Borrowed By|
    And the user should be able to search books with different categories
      |ALL|
      |Action and Adventure|
      |Anthology|
      |Classic  |
      |Comic and Graphic Novel|
      |Crime and Detective    |
      |Drama                  |
      |Fable                  |
      |Fairy Tale             |
      |Fan-Fiction            |
      |Fantasy                |
      |Historical Fiction|
      |Horror|
      |Science Fiction|
      |Biography/Autobiography|
      |Humor|
      |Romance|
      |Short Story|
      |Essay|
      |Memoir|
      |Poetry|
