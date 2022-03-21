@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Making the board
    Given I want to make a board with difficulty <diff>
    When I initialize 1000 boards
    Then make board with obstacle range between <lower> and <higher>

    Examples: 
      | diff   | lower | higher  |
      | easy   |   5   |   10    |
      | medium |   10  |   20    |
      | hard   |   20  |   30    |
