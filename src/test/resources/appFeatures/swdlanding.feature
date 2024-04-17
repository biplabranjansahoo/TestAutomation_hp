Feature: swd landing page

  Background: 
    Given the user is on the HP Support Home page
    And user accepts cookies
    And user is on the swd landing page
    Then the swd landing page title should be "Drivers and Software Download"

  @SWDPage_Header @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC1_SWDL - P3 - Header Footer - Availability
    Then user check for the headers presence
    Then user check for the footers presence

  @SWDPage_SecNav @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC2_SWDL - P2 - Secondary Nav - Availability
    Then user will see secondary navigation bar

  @Widgets @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC3_SWDL - P2 - Widgets - Availability
    Then user checks for the presence of the widget

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC4_SWDL - P3 - CLC Selector - Availability
    Then check if clc selector is present

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC5_SWDL - P3 - CLC Selector - Functionality
    Then check if clc selector is working

  @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC6_SWDL - P1 - SWD Landing Page bread crumb - Functionality
    Then user check for the presence of breadcrumb on swd landing page

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC7_SWDL - P1 - SWD Landing Page sign in riboon - Functionality
    Then user check for the presence of sign in ribbon on swd landing page

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC8_SWDL - P1 - SWD Landing Page products row - Functionality
    Then user check for the presence of products row on swd landing page

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC9_SWDL - P1 - SWD Landing Printer tile - Functionality
    Then check if printer tile is working

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC10_SWDL - P1 - SWD Landing Page Sign in - Functionality
    Then user successfully sign in with the credentials of "user1"
    Then user check for the presence of device swiper on swd landing page after signed in
    Then user check for the presence of breadcrumb on swd landing page after signed in
    Then user check for the presence of products row on swd landing page after signed in