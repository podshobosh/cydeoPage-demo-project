Feature: View All Orders Page functionalities
  Scenario: Selecting and Deselecting All Orders
    Agile Story: User should be able to select and deselect all orders

    Given user is already logged on to the Web Tables App
    And user is on the View all Orders page
    When user clicks the select button
    Then all optioins should be checked
    When user clicks on the deselect button