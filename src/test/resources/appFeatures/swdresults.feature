Feature: swd results page

  Background: 
    Given the user is on the HP Support Home page
    And user accepts cookies
    And user is on the swd products page
    When navigate to os selection page
    Then user check for the welcome message on os selection page
    Then user selects the required os and version
    Then user check for the welcome message on os results page

  @Header @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC1_SWDRES - P3 - Header Footer - Availability
    Then user check for the headers presence
    Then user check for the footers presence

  @SecNav @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC2_SWDRES - P2 - Secondary Nav - Availability
    Then user will see secondary navigation bar

  @Widgets @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC3_SWDRES - P2 - Widgets - Availability
    Then user checks for the presence of the widget

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC4_SWDRES - P3 - CLC Selector - Availability
    Then check if clc selector is present

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC5_SWDRES - P3 - CLC Selector - Functionality
    Then check if clc selector is working

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC6_SWDRES - P1 - SWD results Page bread crumb - Functionality
    Then user check for the presence of breadcrumb on swd results page

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC7_SWDRES - P1 - SWD results Page product details - Functionality
    Then user check for the presence of product details on swd results page

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC8_SWDRES - P1 - SWD results Page results section - Functionality
    Then user check for the presence of results section on swd os results page

  @Regression_All @Smoke_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC9_SWDRES - P1 - SWD Results Page Sign in - Functionality
    Then user successfully sign in with the credentials of "user1"
    Then user check for the presence of signed in button
    Then user selects the required os and version
    Then user check for the welcome message on os results page
    Then user check for the presence of breadcrumb on swd results page
    Then user check for the presence of product details on swd results page
    Then user check for the presence of results section on swd os results page