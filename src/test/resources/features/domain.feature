Feature: Bill component
  Scenario: list bills
    When I GET "/bills"
    Then the response status is 200
