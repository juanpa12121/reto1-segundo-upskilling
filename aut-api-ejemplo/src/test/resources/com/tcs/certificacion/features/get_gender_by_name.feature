#The name parameter is alphabetic between 3 and 10 characters
#The “gender” field only returns the values “male” And “female”
#The “name” field returns the name given to the service.
#The “probability” field returns the percentage (in percentage format between 0% and 100%) of
#probability that the gender returned by the service is suitable for the name.
#The "count" field returns a positive number.
#The status code for successful responses is 200, for cases where the user sent
#the request in the wrong way the response code will be 400.

Feature: Get gender by name
  Scenario Outline: Query gender by name and validate various conditions
    Given I can query the genderize api
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