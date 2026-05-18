Feature: login

  Scenario Outline: As a user I want to login to Ndosi website with valid credentials
    Given I am on the login page
    And I enter valid email <email>
    And I enter valid  password <password>
    When I click the login button
    Then I should be logged in successfully
    Examples:
      | email | password |
      | email | password |

