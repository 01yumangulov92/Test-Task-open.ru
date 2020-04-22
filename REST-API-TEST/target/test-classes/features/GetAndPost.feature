Feature: Test Api

  Scenario: Test method GET
    Given we are send get request with endpoint - "users?page=2" and check it for NotNull


  Scenario: Test method POST
    Then test api with endpoint - "users"
    |name|morpheus|
    |job|leader|