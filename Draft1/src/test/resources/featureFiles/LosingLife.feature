@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: General losing life from obstacles
  	Given The robot has <lives> lives
		When Robot interacts with obstacle
		Then Subtract <obsDamage> from lives
