Feature: swd products page

  Background: 
    Given the user is on the HP Support Home page
    And user accepts cookies
    And user is on the swd products page
    Then the swd products page title should be "Software and Driver Downloads"

  @Header @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC1_SWDPRO - P3 - Header Footer - Availability
    Then user check for the headers presence
    Then user check for the footers presence

  @SecNav @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC2_SWDPRO - P2 - Secondary Nav - Availability
    Then user will see secondary navigation bar

  @Widgets @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC3_SWDPRO - P2 - Widgets - Availability
    Then user checks for the presence of the widget

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC4_SWDPRO - P3 - CLC Selector - Availability
    Then check if clc selector is present

  @clcSelector @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC5_SWDPRO - P3 - CLC Selector - Functionality
    Then check if clc selector is working

  @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC6_SWDPRO - P1 - SWD products Page breadcrumb - Functionality
    Then user check for the presence of breadcrumb on swd products page

	@Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC7_SWDPRO - P1 - SWD products Page sign in ribbon - Functionality
    Then user check for the presence of sign in ribbon on swd products page

  @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC8_SWDPRO - P1 - SWD products Page pFinder section - Functionality
    Then user check for the presence of pFinder section on swd products page

  @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC9_SWDPRO - P1 - SWD products Page carousel - Functionality
    Then user check for the presence of carousel on swd products page

  @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC10_SWDPRO - P1 - SWD products Page products row - Functionality
    Then user check for the presence of products row on swd products page

  @Regression_All @Smoke_SoftwareDrivers @Regression_SoftwareDrivers
  Scenario: TC11_SWDPRO - P1 - SWD Products Page Sign in - Functionality
    Then user successfully sign in with the credentials of "user1"
    Then user check for the presence of device swiper on swd products page after signed in
    Then user check for the presence of breadcrumb on swd products page after signed in
    Then user check for the presence of pFinder section on swd products page after signed in
    Then user check for the presence of carousel on swd products page after signed in
    Then user check for the presence of products row on swd products page after signed in