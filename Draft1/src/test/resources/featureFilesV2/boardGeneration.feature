@tag
Feature: 
  I want to make a board for roborally

  @tag1
  Scenario: Generating the board with small size
  Given a width 9 and length 9
  And no game is already being played
  And there are at least two players
  When game starts
  Then game produces a board
  
  Scenario: Generating the board with medium size
  Given a width 11 and length 11
  And no game is already being played
  And there are at least two players
  When game starts
  Then game produces a board
  
  Scenario: Generating the board with large size
  Given a width 15 and length 15
  And no game is already being played
  And there are at least two players
  When game starts
  Then game produces a board	
