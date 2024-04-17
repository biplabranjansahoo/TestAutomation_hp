Feature: swd os selection page

  Background: 
    Given the user is on the HP Support Home page
    And user accepts cookies
    And user is on the swd products page
    When navigate to os selection page
    Then user check for the welcome message on os selection page

  @Header @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC1_SWDOS - P3 - Header Footer - Availability
    Then user check for the headers presence
    Then user check for the footers presence

  @SecNav @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC2_SWDOS - P2 - Secondary Nav - Availability
    Then user will see secondary navigation bar

  @Widgets @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC3_SWDOS - P2 - Widgets - Availability
    Then user checks for the presence of the widget

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC4_SWDOS - P3 - CLC Selector - Availability
    Then check if clc selector is present

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC5_SWDOS - P3 - CLC Selector - Functionality
    Then check if clc selector is working

  @swdOSSelectionPageAnonymous @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC6_SWDOS - P1 - SWD os selection Page bread crumb- Functionality
    Then user check for the presence of breadcrumb on swd os selection page

  @swdOSSelectionPageAnonymous @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC7_SWDOS - P1 - SWD os selection Page product details- Functionality
    Then user check for the presence of product details on swd os selection page

  @swdOSSelectionPageAnonymous @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC8_SWDOS - P1 - SWD os selection Page os selection section - Functionality
    Then user check for the presence of OS selection section on swd os selection page

  @usersigninSWDOSSelectionPage @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC9_SWDOS - P1 - SWD OS Selection Page Sign in - Functionality
    Then user successfully sign in with the credentials of "user1"
    Then user check for the presence of signed in button
    Then user check for the presence of product details on swd os selection page after signed in
    Then user check for the presence of breadcrumb on swd os selection page after signed in
    Then user check for the presence of os selection section on swd os selection page after signed in