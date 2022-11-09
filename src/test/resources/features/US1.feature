
Feature: As a user, I should be accessing all the main modules of the app.

  Scenario Outline: Verify login with valid credentials
    Given user on the login page Try Cloud Login Page
    When user use username "<username>" and passcode "<password>"

    And user click the login button
    Then verify the user should be at the dashboard page
    Examples:
      | username | password    |
      | user7    | Userpass123 |



 #Feature: As a user, I should be accessing all the main modules of the app.

   Scenario:  Verify users accessing all the main modules of the app.
     Given user on the login page
     When the users  log in with valid credentials
     Then Verify the user see the following modules:
       | Dashboard |
       | Files     |
       | Photos    |
       | Activity  |
       | Talk    |
       | Contacts  |
       | Circles   |
       | Calendar  |
       | Deck      |
       | More apps  |