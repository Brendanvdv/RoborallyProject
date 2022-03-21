@tag
Feature: Making a board
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
      
	@tag2
  Scenario: Using a movement card
    Given A movement card <card>
    When A card is chosen and executed
    Then move the robot forwards <stepNumber> steps

  @tag3
  Scenario: Using a rotation card
    Given A rotation card <card>
    When A card is chosen and executed
    Then rotate the robot right <rotateNumber> times
      
  @tag4
  Scenario: Standing on a pit
    Given the information about the tile under <tileUnder>
    When the tile under is a pit
    Then decrease lives to zero and end game

  @tag5
  Scenario: Standing on a healthpack
  	Given the information about the tile under <tileUnder>
  	When the tile under is a healthpack
  	Then increase the lives by one
  	
  @tag6
  Scenario: Standing on a checkpoint
  	Given the information about the tile under <tileUnder>
  	When the tile under is a checkpoint
  	Then end the game
  
  @tag7
  Scenario: Ending previous turn and starting a new one
  	Given amount of cards left <cardsLeft>
  	When no more cards are left
  	Then end turn and restart new turn
  	
  @tag8
  Scenario: General losing life from obstacles
  	Given The robot has <lives> lives
		When Robot interacts with obstacle
		Then Subtract <obsDamage> from lives
		
	@tag9
	Scenario: Placing a robot manually 
		Given A new board <board>
		When a user places the robot
		Then place robot at a cornertile <tileCorner>
		
  @tag10
  Scenario: Standing on a gear
    Given the information about the tile under <tileUnder>
    When the tile under is a gear
    Then rotate the robot <rotateNumber> times
  
  @tag11
  Scenario: Standing on a acid tile
    Given the information about the tile under <tileUnder>
    When the tile under is acid
    Then end turn
  
  @tag12
  Scenario: Standing on a booster
    Given the information about the tile under <tileUnder> 
    And the direction of the booster <boosterDirection>
    When the tile under is a booster
    Then move robot <stepNumber> times forward in the booster direction
  
  @tag13
  Scenario: Standing on a laser
    Given the information about the tile under <tileUnder>
    When the tile under is a laser
    Then decrease lives by one
  
  @tag14
  Scenario: Standing by a barrel
    Given the information about the tile in front <tileFront>
    When the tile is a barrel
    Then decrease <stepNumber> to zero and continue
    
  @tag15
  Scenario: Testing validity of board
  	Given a board <board>
  	When game starts
  	Then check if path exists from corners to middle <pathValid>
  	
  @tag16
  Scenario: If two robots collide
  	Given two robots
  	When robot1 faces robot2
  	And robot1 is adjacent to robot2
  	And robot1 has movement forward <stepNumber>
  	Then apply stepNumber on robot2
  	
  @tag17
  Scenario: Creating checkpoint
  	Given a board <board>
  	When game starts
  	Then find middle of board
  	And create checkpoint in middle

  
  
  
  
  
  
  
  
  
  
  
  	
  	