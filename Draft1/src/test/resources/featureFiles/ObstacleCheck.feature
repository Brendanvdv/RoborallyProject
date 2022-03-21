@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Standing on a acid tile
    Given the information about the tile under <tileUnder>
    When the tile under is acid
    Then end turn
    
  @tag2
  Scenario: Standing on a pit
    Given the information about the tile under <tileUnder>
    When the tile under is a pit
    Then decrease lives to zero and end game

  @tag3
  Scenario: Standing on a healthpack
  	Given the information about the tile under <tileUnder>
  	When the tile under is a healthpack
  	Then increase the lives by one
  	
  @tag4
  Scenario: Standing on a checkpoint
  	Given the information about the tile under <tileUnder>
  	When the tile under is a checkpoint
  	Then end the game
  	
 @tag5
  Scenario: Standing on a gear
    Given the information about the tile under <tileUnder>
    When the tile under is a gear
    Then rotate the robot <rotateNumber> times
  
  @tag6
  Scenario: Standing on a acid tile
    Given the information about the tile under <tileUnder>
    When the tile under is acid
    Then end turn
  
  @tag7
  Scenario: Standing on a booster
    Given the information about the tile under <tileUnder> 
    And the direction of the booster <boosterDirection>
    When the tile under is a booster
    Then move robot <stepNumber> times forward in the booster direction
  
  @tag8
  Scenario: Standing on a laser
    Given the information about the tile under <tileUnder>
    When the tile under is a laser
    Then decrease lives by one
  
  @tag9
  Scenario: Standing by a barrel
    Given the information about the tile in front <tileFront>
    When the tile is a barrel
    Then decrease <stepNumber> to zero and continue