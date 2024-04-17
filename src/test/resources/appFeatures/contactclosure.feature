Feature: contact closure Page

Background:
Given the user is on the contact support landing page
And   user accepts cookies
And   user successfully sign in with the credentials of "user1"
And   the user sees the contact support welcome message "let’s get you some help"
When  the user navigates to the contact options page
Then  the omni chat contact option is functional
And   clicks on the submit button

@CustomerSupportPopUp @Regression_All @Smoke_All @Smoke_Contact @Regression_Contact
Scenario: TC1_CS_CLSR - P2 - Customer Support pop-up - Functionality
		Then customer support pop-up availability
    Then customer support pop-up functionality
		Then customer support pop-up closure pop-up functionality

@ContactClosurePage_GoToDashboardLink @Smoke_All @Regression_All @Smoke_Contact @Regression_Contact
Scenario: TC2_CS_CLSR - P2 - Go to dashboard link - Functionality
		Then contact closure page go to dashboard link availability
    Then contact closure page go to dashboard link functionality
    

@BackToAllContactOptionsLink @Regression_All @Smoke_Contact @Regression_Contact
Scenario: TC3_CS_CLSR - P2 - Back to all contact options link - Functionality
		Then contact closure page back to all contact options link availability
    Then contact closure page back to all contact options link functionality
