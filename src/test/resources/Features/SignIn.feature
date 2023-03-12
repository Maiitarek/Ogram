Feature: Sign in

  Background:
    Given I am on Sign In page


  @testcase3
  Scenario Outline: As a User I should be able to Sign in with a valid email and password

    Then I Can Sign in with valid "<email>" and valid "<password>"


    Examples:

      | email                   | password  |
      | maiitarek2013@gmail.com | P@ssw0rd! |

  @testcase4
  Scenario Outline: As a User I should be not be able to Sign in with a invalid email and password

    Then I Can't Sign in with invalid "<email>" and valid "<password>"


    Examples:

      | email                   | password  |
      | Roaa_khatab@hotmail.com | P@ssw0rd! |






