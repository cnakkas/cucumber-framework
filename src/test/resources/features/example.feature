
  Feature: User Navigates to Google and search

    @wip
    Scenario: Google search must show results
      Given the user navigates to google
      When the user search the "selenium" keyword
      Then the user should see search result number must be more than 0