Feature: login functionality

  @tag1
  Scenario: Test login function
    Given user is on home page
    When enter username and password
    Then display login msg successfully