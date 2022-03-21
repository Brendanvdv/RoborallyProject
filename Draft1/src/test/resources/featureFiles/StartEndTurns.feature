@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Ending previous turn and starting a new one
  	Given amount of cards left <cardsLeft>
  	When no more cards are left
  	Then end turn and restart new turn
