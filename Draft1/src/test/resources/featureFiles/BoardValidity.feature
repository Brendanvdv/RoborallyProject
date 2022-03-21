@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Testing validity of board
  	Given a board <board>
  	When game starts
  	Then check if path exists from corners to middle <pathValid>
