Feature: contact options page

  Background: 
    Given the user is on the contact support landing page
    And user accepts cookies
    And user successfully sign in with the credentials of "user1"
    And the user sees the contact support welcome message "let’s get you some help"
    When the user navigates to the contact options page

  @SerialNumber @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC1_CS_OPTION - P2 - My Device Card - Serial Number, Choose a different - Availability
    And the serial number has to be present
    When the choose a different product link is present
    Then the choose a different product link is functional

  @OmniChat2 @Regression_All @Smoke_Contact @Smoke_All @Regression_Contact
  Scenario: TC2_CS_OPTION - P2 - Omni Chat Contact Option - Functionality
 		When the omni chat contact option is present
    Then the omni chat contact option is functional

  @ProductExchange @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC3_CS_OPTION - P2 - Product Exchange Contact Option - Functionality
  	When the product exchange contact option is present
    Then the product exchange contact option is functional

  #@SupportCommunity2 @Regression_All @Smoke_Contact @Regression_Contact
  #Scenario: TC4_CS_OPTION - P2 - HP Support Community Contact Option - Functionality
 #		When the hp support community contact option is present
    #Then the hp support community contact option is functional

  @Phone @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC5_CS_OPTION - P2 - Speak to an Agent and Phone Contact Option - Availability
  	Then the speak to an agent contact option is present
    When the phone contact option is present

  @ContactOptionPage_SupportResourceTitle @Smoke_All @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC6_CS_OPTION - P2 - Support Resource Title - Availability
    And the title for more support resources is present
    When the hp support assistant tile is present
    And the hp support assistant tile is functional

  #@HPSupportAssistantt @Regression_All @Smoke_Contact @Regression_Contact
  #Scenario: TC7_CS_OPTION - P2 - Support Resources Tile - HP Support Assistant - Functionality
  #	When the hp support assistant tile is present
    #And the hp support assistant tile is functional 
#
  #@HPSupportCommunity @Regression_All @Smoke_Contact @Regression_Contact
  #Scenario: TC8_CS_OPTION - P2 - Support Resources Tile - HP Support Community Tile- Functionality
 #		When the hp support community tile is present
    #And the hp support community tile is functional
#
  #@Software&drivers2 @Regression_All @Smoke_Contact @Regression_Contact
  #Scenario: TC9_CS_OPTION - P2 - Support Resources Tile - Software and drivers - Functionality
  #	When the software and drivers tile is present
    #When the software and drivers tile is functional

  @CLCSelector @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC10_CS_OPTION -P3 - CLC Selector - Functionality
  	Then check if clc selector is present
    Then check if clc selector is working
