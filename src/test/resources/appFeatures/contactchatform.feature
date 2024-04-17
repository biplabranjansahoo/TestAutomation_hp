Feature: contact chat form page

  Background: 
    Given the user is on the contact support landing page
    And user accepts cookies
    And user successfully sign in with the credentials of "user1"
    And the user sees the contact support welcome message "let’s get you some help"
    When the user navigates to the contact options page
    Then the omni chat contact option is functional

  @ContactEmail @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC3_CS_CHAT - P3 - Chat form page title and more information fields - Availability
  	Then the title of the chat form page should be visible
  	Then the input field for entering the name should be visible
    Then the input field for entering the email address should be visible
    Then the input field for entering the phone number should be visible
    Then the input field for entering the phone number should accept the phone number format
  	Then the input field for entering the alternate email address should be visible
    Then the input field for entering the alternate email address should accept the email format
    Then the title or label for the issue description field should be visible
    Then the dropdown menu for selecting the operating system in the issue description section should be visible
    Then the dropdown menu for selecting the operating system should display available options
    Then the input field for entering an error code in the issue description section should be visible
    Then the input field for entering a case ID in the issue description section should be visible
    Then the input field for entering additional details or description of the issue should be visible
    Then the input field for entering additional description should accept text input
    Then the privacy policy link should be visible
    Then clicking on the privacy policy link should redirect to the privacy policy page
    Then the submit button should be visible
  	Then the link to navigate back to contact options should be visible
    Then click on back to contact options link navigate back to contact options page