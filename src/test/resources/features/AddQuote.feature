@AddQuote
Feature: Add Quote

  @Blue
  Scenario: Add quote with color blue
    Given user open quote page
    When user input quote "There is a will there is a way"
    When user select color "Blue"
    When user click button add quote
    Then user see quote "There is a will there is a way error" on index 1

  @Magenta
  Scenario: Add quote with color magenta
    Given user open quote page
    When user input quote "There is a will there is a way"
    When user select color "Magenta"
    When user click button add quote
    Then user see quote "There is a will there is a way" on index 1