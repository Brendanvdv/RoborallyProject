@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: If two robots collide
  	Given two robots
  	When robot1 faces robot2
  	And robot1 is adjacent to robot2
  	And robot1 has movement forward <stepNumber>
  	Then apply stepNumber on robot2
