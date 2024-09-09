@all
Feature: Do something scenarios

  @AB#37129 @37129
  Scenario: AB#37129 - Failure always
    Given I have to do something
    Then it always fails

  @AB#33310 @33310
  Scenario: AB#33310 - Always pass
    Given I have to do something
    Then it always passes

  @30650
  Scenario: Also pass scenario
    Given I have to do something
    Then it always passes

  Scenario: Another passing scenario
    Given I have to do something
    Then it always passes
