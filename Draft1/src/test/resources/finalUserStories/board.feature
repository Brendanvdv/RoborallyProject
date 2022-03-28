
@tag
Feature: board file

  @tag1
  Scenario: Define the board
    Given two integers width <w> and height <h>
    Then define board

  Scenario: Making the board
  	Given a board 
  	Then make a board
  	
  Scenario: Print board
  	Given a board
  	Then print board
  	
  Scenario: Pulling a value from the board
  	Given two integers x <int> and y <int>
  	Then return a string on board with those values
  