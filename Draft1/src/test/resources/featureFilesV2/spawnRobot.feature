@tag
Feature: Spawn a robot

  @tag1
  Scenario: Spawn 2 robots
    Given 2 players
    And a board
    When board has been generated
    Then place robots at opposite corners
    
  Scenario: Spawn 3 robots
    Given 3 players
    And a board
    When board has been generated
    Then place robots at random corners
  
  Scenario: Spawn 4 robots
    Given 4 players
    And a board
    When board has been generated
    Then place robots at all corners

