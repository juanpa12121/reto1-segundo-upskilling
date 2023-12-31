Feature: Get gender by name
  Scenario Outline: Query gender by name and validate various conditions
    #Given I can query the genderize api
    When I query the genderize api with name "<name>"
    Then I get a response with status code <status_code>
    And Gender response only returns male or female
    And Name response returns the name "<name>" given to the service
    And Probability response returns a percentage between 0 and 1
    And Count response returns a positive number

    Examples:
      | name    | status_code |
      | john    | 200         |
      | jane    | 200         |
      | unknown | 200         |