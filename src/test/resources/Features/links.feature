Feature: Links

  Scenario: Click first page
    Given I am at link page
    When I Click Home link
  Then I move to the page:"https://demoqa.com/"
