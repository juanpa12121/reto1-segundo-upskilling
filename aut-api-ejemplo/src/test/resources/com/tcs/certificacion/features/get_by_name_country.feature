Feature: Post by name and country

  Scenario Outline: Query gender by name and country
    #Given I can query the genderize api
    When I query the genderize api with name "<name>" and country "<country>"
    Then I get a response with status code <status_code>
    And Gender response only returns male or female
    And Name response returns the name "<name>" given to the service
    And Country response returns the country "<country>" given to the service
    And Probability response returns a percentage between 0 and 1
    And Count response returns a positive number

    Examples:
      | name  | country | status_code |
      | John  | US      | 200         |
      | Peter | ES      | 200         |
      | Lucia | FR      | 200         |

