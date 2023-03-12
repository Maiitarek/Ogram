Feature: Register and get started as a Company

  Background:
    Given I am on start hiring page

  @testCase1
Scenario: As a User I should be able to select any type of Staff to hire

  Then I can select any staff type I need


  @testcase2
  Scenario Outline: As a User I should be able to search for any type of staff to hire

    Then I can search for "<staffType>"

    Examples:

    | staffType                    |
    | Admin Assistant/Receptionist |
    | Admin Data Entry             |
    | Assistant Chef               |
    | Barback                      |
    | Barista                      |
    | Bartender                    |
    | Bouncer                      |
    | Butcher                      |
    | Cashier                      |
    | Chef De Partie               |
    | Head Chef                    |





