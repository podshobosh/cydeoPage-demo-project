@smoke
Feature: Cydeo Web Tables Application Login Functionality
  Agile Story: The user should be able to log in to their account by providing the required credentials

  Scenario: Positive Login Scenario
    Given user is on the login page
    When user enters the credentials below
      | username | Test   |
      | password | Tester |
    And clicks login button
    Then user should see "orders" in the URL
