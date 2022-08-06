Feature: Function to test functionality for determining directions between to points


  Scenario Outline: The user defines directions between to points
    Given User on site
    When User clicks to button Find directions between two points
    And User enters text <from> in field From
    And User enters text <to> in field To
    And User chooses transport <type of transport>
    And User clicks button Go
    Then User checks distance between points
    And User closes browser

    Examples:
      | from             | to         | type of transport |
      | "Радищева, Київ" | "Кембридж" | "Bicycle (OSRM)"  |