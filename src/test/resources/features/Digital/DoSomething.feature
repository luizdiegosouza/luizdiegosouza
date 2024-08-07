@all
Feature: Do something scenarios

  @AB#37995 @37995
  Scenario: AB#37995 - Failure always
    Given I have to do something
    Then it always fails

  @AB#37129 @37129
  Scenario: AB#37129 - Always pass
    Given I have to do something
    Then it always passes
