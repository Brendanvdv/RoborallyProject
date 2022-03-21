@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Using a movement card
    Given A movement card <card>
    When A card is chosen and executed
    Then move the robot forwards <stepNumber> steps
    
	@tag2
  Scenario: Using a rotation card
    Given A rotation card <card>
    When A card is chosen and executed
    Then rotate the robot right <rotateNumber> times