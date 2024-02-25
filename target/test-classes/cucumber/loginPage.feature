@tag
Feature:login with credential
@tag2
scenario outline:positive test of login
Given the user has a valid username and password
    When the user enters their username and password
    And the user clicks the login button
    Then the user is navigated to the homepage
    And a welcome message is displayed
    | username | password |
    | user1    | pass1    |
    | user2    | pass2    |