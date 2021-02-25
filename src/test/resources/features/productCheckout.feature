Feature: product checkout Feature
  Scenario Outline: check the product price
    Given the prices of the "<product>" is <price>
    When I check <quantity> of "<product>"
    Then The total price of "<product>" should be <total>

    Examples:
    | product  | price | quantity | total |
    | apple    | 40    |  1       |   40  |
    | banana   | 50    |  2       |  100  |
    | grapes   | 30    |  3       |   90  |
    | oranges  | 40    |  2       |   80  |