Feature: hp all in plan(sdp) landing page

  Background: 
    Given the user is on the HPAllinPlan landing page
    And user accepts cookies

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan 
  Scenario: TC1_HPALL - P3 - Header Footer - Availability
    Then user check for the headers presence
    Then user check for the footers presence

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC2_HPALL - P2 - Secondary Nav - Availability
    Then user will see secondary navigation bar

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC3_HPALL - P2 - Widgets - Availability
    Then user checks for the presence of the widget

  @HpAllInPlanPage_Title  @Regression_All @Smoke_All @Smoke_HPAllInPlan
  Scenario: TC4_HPALL - P3 - Page Tab Title - Availability
    Then the user checks for the browser tab title

  @HpAllInPlanPage_HeroSection @Regression_All @Smoke_All @Smoke_HPAllInPlan
  Scenario: TC5_HPALL - P2 - Hero Section - Availability
    Then the user checks for the herosection

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC6_HPALL - P3 - Hero Section Title - Availability
    Then the user checks for the title and subtitle in the hero section

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC7_HPALL - P3 - Hero Section Description - Availability
    Then the user checks for the text and link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC8_HPALL - P3 - Hero Section Image - Availability
    And the user perform checks for the image in the hero section

  @HpAllInPlanPage_Categories @Regression_All @Smoke_All @Smoke_HPAllInPlan
  Scenario: TC9_HPALL - P2 - Categories - Availability
    Then the user checks for the support categories section
    Then the user perform checks for the support articles by topic section
    Then the user perform checks for the Additonal support section
    Then the user perform checks for the knowledgesearch section

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC10_HPALL - P2 - Support Category Tiles - Availability
    Then the user checks for the tiles

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC11_HPALL - P2 - Your All in Plan Tile - Availability
    Given the user checks for the Your All in Plan tile title
    Then the user clicks on the Your All in Plan tile under support Category
    And the user checks for the three sections under Your all in Plan tile

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC12_HPALL - P3 - Your All in Plan Tile - First card - ManageBoxCard - Availability
    Then the user clicks on the Your All in Plan tile under support Category
    Then the user checks for the Manage box title and content
    And the user checks for the Manage Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC13_HPALL - P3 - Your All in Plan Tile - Second card - ManageBoxCard - Availability
    Then the user clicks on the Your All in Plan tile under support Category
    Then the user checks for the Change box title and content
    And the user checks for the Change Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC14_HPALL - P3 - Your All in Plan Tile - Third card - GetBoxCard - Availability
    Then the user clicks on the Your All in Plan tile under support Category
    Then the user checks for the Get box title and content
    And the user checks for the Get Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC15_HPALL - P2 - Your Ink Tile - Availability
    Given the user checks for the Your Ink tile title
    Then the user clicks on the Your Ink tile under support Category
    And the user checks for the three sections under Your Ink tile

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC16_HPALL - P3 - Your Ink - First card - ShippingBoxCard - Availability
    Then the user clicks on the Your Ink tile under support Category
    Then the user checks for the Shipping box title and content
    And the user checks for the Shipping Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC17_HPALL - P3 - Your Ink - Second card - WhyBoxCard - Availability
    Then the user clicks on the Your Ink tile under support Category
    Then the user checks for the Why box title and content
    And the user checks for the Why Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC18_HPALL - P3 - Your Ink - Third card - RelatedTopicsCard  - Availability
    Then the user clicks on the Your Ink tile under support Category
    Then the user checks for the Related Topics box title
    And the user checks for the Related Topics links

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC19_HPALL - P2 - Your Printer Tile - Availability
    Given the user checks for the Your Printer tile title
    Then the user clicks on the Your Printer tile under support Category
    And the user checks for the three sections under Your Printer tile

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC20_HPALL - P3 - Your Printer - First card - SetupBoxCard - Availability
    Then the user clicks on the Your Printer tile under support Category
    Then the user checks for the Setup box title and content
    And the user checks for the Setup Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC21_HPALL - P3 - Your Printer - Second card - ConnectBoxCard - Availability
    Then the user clicks on the Your Printer tile under support Category
    Then the user checks for the Connect box title and content
    Then the user checks for the link in the connect box

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC22_HPALL - P3 - Your Printer - Third card - AboutBoxCard  - Availability
    Then the user clicks on the Your Printer tile under support Category
    Then the user checks for the About box title and content
    Then the user checks for the links in the About box
    And the user checks for the About Box CTA button link

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC23_HPALL - P2 - Support Articles Content - Availability
    Then the user checks for the support articles content

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC24_HPALL - P3 - Support Articles - Functionality
    Then the user checks for the viewmore link availablity
    And the user clicks on any of the Hyperlink

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC25_HPALL - P2 - Additional Support Section - Availability
    Then the user perform checks for the two sections under additional support section

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC26_HPALL - P2 - Additional Support Section - Functionality
    When the user checks for the title of ContactHP Support tile
    When the user checks for the title of Use VirtualAssistant tile

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC27_HPALL - P3 - Additional Support - Contact Support - Availability
    Then the user checks for the Contact Support Icon
    Then the user checks for the ContactSupport description and arrow

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC28_HPALL - P3 - Additional Support - Virtual Assistant - Availability
    Then the user checks for the Virtual Assistant Icon
    Then the user checks for the VirtualAssistant description and arrow
    Then the user clicks on the Use Virtual Assistant tile

  @Regression_All @Regression_HPAllInPlan @Smoke_HPAllInPlan
  Scenario: TC29_HPALL - P2 - Knowledge Search Section - Availability
    Then the user perform checks for the knowledgesearch section

  @HpAllInPlanPage_KnowledgeSearch @Regression_All @Smoke_All @Smoke_HPAllInPlan
  Scenario: TC30_HPALL - P2 - Knowledge Search Section - Functionality
    Then the user checks for the gray text in the search text field
    Then the user perform search by passing the keyword

  @HpAllInPlanPage_CountrySelector @Regression_All @Smoke_All @Smoke_HPAllInPlan
  Scenario: TC31_HPALL - P2 - Country Selector - Availability
    When the user checks for the country dropdown availablity for united states region
