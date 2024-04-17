Feature: contact us non signed-in home page

  Background: 
    Given the user is on the contact support landing page
    And   user accepts cookies

  @ContactNonSignInPage_HeaderFooter @Smoke_All @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC1_CS_NS -P3 - Header Footer - Availability
    When  start "TC1_CS_NS"
    Then  user check for the headers presence
    Then  user check for the footers presence
    And   end "TC1_CS_NS"

  @ContactNonSignInPage_SecNav @Smoke_All @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC2_CS_NS -P2 - Secondary Nav - Functionality
    When  start "TC2_CS_NS"
    Then  user will see secondary navigation bar
    When  user checks for the products tab in sec nav
    When  user hover on the products dropdown from sec nav
    Then  the user select printer support - product dropdown
    Then  the user checks the browser tab title - "Official HP® Printer Support"
    When  user hover on the products dropdown from sec nav
    Then  the user select computer support - product dropdown
    Then  the user checks the browser tab title - "Official HP® Laptop & Desktop Computer Support"
    When  user hover on the products dropdown from sec nav
    Then  the user will have an option to select all - product dropdown
    Then  the user checks the browser tab title - "HP Customer Support for Printers, Laptops, Desktops and More | HP® Support"
    When  user checks for the software and drivers tab in sec nav
    When  user click on the software and drivers tab from sec nav
    Then  the user checks the browser tab title - "Official HP® Drivers and Software Download | HP® Support"
    And   the swd page title should be "Welcome to HP Software and Drivers"
    When  user checks for the diagnostics tab in sec nav
    When  user checks for the contact us tab in sec nav
    When  user checks for the business support tab in sec nav
    When  user checks for the my hp account tab in sec nav
    Then  the contact us tab text should availbale as My HP Account
    When  user click on the my hp account dropdown from sec nav
    Then  the user select dashboard - Sec Nav
    Then  the user checks the browser tab title - "My Dashboard | HP® Customer Support"
    And   end "TC2_CS_NS"

  @Widgetss @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC3_CS_NS -P3 - Widgets - Alert - Functionality
    When  start "TC3_CS_NS"
    Then  user checks for the presence of alert icon
    Then  user checks for the notification pop up after clicking alert icon
    Then  user checks for the presence of print icon
    Then  user checks for the print pop up after clicking print icon
    Then  user checks for the presence of feedback icon
    And   end "TC3_CS_NS"

  @TabTitle @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC4_CS_NS - P3 - Page Tab Title, Page Title- Functionality
    When  start "TC4_CS_NS"
    Then  the user checks the browser tab title - "Contact Official HP® Support - United States | HP® Support"
    Then  non-signedin contact page title should be "Let's get you some help"
    And   end "TC4_CS_NS"

  @Tooltip @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC5_CS_NS - P2 - Row Title - Why Should I sign in - Functionality
    When  start "TC5_CS_NS"
    Then  the user checks for the tooltip why should I signin text "Why should I sign in?"
    Then  the user checks for signIn button "Sign in"
    When  user successfully sign in with the credentials of "user1"
    Then  the user sees the contact support welcome message "let’s get you some help"
    Then  the user check for create an account button "Create an account"
    And   the user click on create an account button
    Then  the create account page title should be "Create account"
    Then  the user check for get started before sign in link "Get started before signing in"
    And   the user clicks on get started before sigin link
    Then  the choose products page title should be from db TC "Which product are you contacting"
    And   end "TC5_CS_NS"

  @ContactSupportQuickLink @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC6_CS_NS - P2 - Quick link Tiles - Functionality
    When  start "TC6_CS_NS"
    Then  quick link title is present "Quick links"
    Then  then user clicks on quick link tiles 
    And   end "TC6_CS_NS"

  @CarousalBanner @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC7_CS_NS - P2 - Carousal Banner - Functionality
    When  start "TC7_CS_NS"
    Then  check if carousel banner is present
    Then  check if carousel banner swiper is working
    And   end "TC7_CS_NS"

  @clc @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC8_CS_NS - P2 - CLC Selector - Functionality
    When  start "TC8_CS_NS"
    Then  check if clc selector is present
    Then  check if clc selector is working
    And   end "TC8_CS_NS"

 
