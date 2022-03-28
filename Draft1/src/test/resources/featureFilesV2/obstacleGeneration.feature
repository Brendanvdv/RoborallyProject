
@tag
Feature: I want to make obstacles

  @tag1
  Scenario: I want to produce a checkpoint
    Given a board with width <w> and length <l>
    When a board has been generated
    Then spawn checkpoint in the middle

  @tag2
  Scenario: I want to make an obstacle
    Given I want to make an obstacle with name <name>
    And a probability <prob>
    When a board has been generated
    Then I replace the tile with a character <char>

    Examples: 
      | name       | prob | char |
      | pit        | 0.05 | P    |
      | barrel     | 0.05 | B    |
			| laser      | 0.05 | L    |
			| acid       | 0.05 | A    |
			| healthpack | 0.05 | H    |
			| conveyor   | 0.05 | C    |
			| gear       | 0.05 | G    |
			
	Scenario: Obstacles in the corners
		Given: a tile which is a corner
		When: obstacles are being generated
		Then: do not change tile type