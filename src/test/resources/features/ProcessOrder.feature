@smoke
Feature: Making an Oder Functionality
  Scenario Outline: Cydeo Web Table App Placing an Order functionality
  Agile Story: As a user I should be able to enter the required information
  in order to process/create a new order

    Given user is already logged on to the Web Tables App
    When user is on the Oder page
    And user selects one of the below options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |
    And user enters quantity "<quantity>"
    Then user clicks to calculate button
    Then user enters customer name "<customerName>"
    And user enters enters street "<streetAddress>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zip "<zip>"
    And user selects payment option "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiration date "<expirationDate>"
    And user clicks to process order button
    Then user should see "<expectedName>" in the first row of the web table

    Examples:
      | quantity | customerName | streetAddress | city        | state | zip   | cardType | cardNumber       | expirationDate | expectedName |
      | 3        | Joe Dumar    | 1234 Street   | San Antonio | TX    | 12345 | Visa     | 1111222233334444 | 12/28          | Joe Dumar    |


  Scenario: Cydeo WebTable App Reset Fields functionality in Order page
    Given user is already logged on to the Web Tables App
    And user is on the Oder page
    And all the requied fields for processing an order are filledout
    When user clicks Reset Fields button
    Then all the field should be emptied