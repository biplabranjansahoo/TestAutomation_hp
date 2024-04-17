Feature: support home page

Background: 
    Given the user is on the HP Support Home page
    And   user accepts cookies
    
@SiteHomePage_Header @Regression_All @Smoke_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC1_SH - P3 - Header Footer - Availability
    Then user check for the headers presence
    Then user check for the footers presence
    
@SiteHomePage_SecNav @Regression_All @Smoke_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC2_SH - P2 - Secondary Nav - Availability
    Then user will see secondary navigation bar
    
@Widgets @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC3_SH - P2 - Widgets - Availability
    Then user checks for the presence of the widget
    
@SiteHomePage_Login @Regression_All @Smoke_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC4_SH - P1 - Login with correct credentials - Functionality
    When user successfully sign in with the credentials of "user1"
    Then the page "signedin" welcome text should match the expected value: " Welcome"

@Regression_Sitehome @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC5_SH - P2 - SiteHome Tiles - Availability
    Then the user checks for the swd tile
    Then the user checks for the printer tile
    Then the user checks for the computer tile

@TabTitle @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC6_SH - P3 - Page Tab Title - Availability
    Then the user checks the browser tab title from db for - "sh_tabtitle"

@Regression_All @Smoke_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC7_SH - P2 - Page Title - Availability
    Then the page "nonsignedin" welcome text should match the expected value: " Welcome"

@Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC8_SH - P2 - SWD Landing Page Tab Title - Availability
    When the user click on the swd tile
    Then the user checks the browser tab title from db for - "swd_tabtitle"
    
@Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC9_SH - P2 - SWD Tile - Functionlaity
    When the user click on the swd tile
    Then the swd page title should be "Welcome to HP Software and Drivers"
    
@Smoke_Sitehome @Regression_All @Regression_Sitehome
Scenario: TC10_SH - P2 - Printer Landing Page Tab Title - Availability
    When the user clicks on the printer tile
    Then the user checks the browser tab title from db for - "pl_tabtitle"
    
@Regression_All  @Smoke_Sitehome @Regression_Sitehome
Scenario: TC11_SH - P2 - Printer Tile - Functionality
    When the user clicks on the printer tile
    Then the printer page title should be "HP Printer Support"

@Smoke_Sitehome @Regression_All  @Regression_Sitehome
Scenario: TC12_SH - P2 - Computer Landing Page Tab Title - Availability
    When the user clicks on the computer tile
    Then the user checks the browser tab title from db for - "cl_tabtitle"
    
@Smoke_Sitehome @Regression_All @Regression_Sitehome
Scenario: TC13_SH - P2 - Computer Tile - Functionality
    When the user clicks on the computer tile
    Then the computer page title should be "HP Computer Support"
    
@SiteHomePage_Pfinder @Smoke_Sitehome @Regression_All @Smoke_All @Regression_Sitehome
Scenario: TC14_SH - P1 - Pfinder - Search by Serial Number - HP - Functionality
    When the user enters a valid serial number in the Pfinder search box - "product1" 
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"
    
@Smoke_Sitehome @Regression_All @Regression_Sitehome
Scenario: TC15_SH - P1 - Pfinder - Search by Serial Number - Poly - Functionality
    When the user enters a valid serial number in the Pfinder search box - "product2" 
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@Smoke_Sitehome @Regression_All @Regression_Sitehome
Scenario: TC16_SH - P1 - Pfinder - Search by Product Number - HP - Functionality
    When the user enters a valid product number in the Pfinder search box - "product1" 
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@Smoke_Sitehome @Smoke_All @Regression_All @Regression_Sitehome
Scenario: TC17_SH - P1 - Pfinder - Search by Product Number - Poly - Functionality
    When the user enters a valid product number in the Pfinder search box - "product2" 
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@Smoke_Sitehome @Regression_All @Regression_Sitehome
Scenario: TC18_SH - P1 - Pfinder - Search by Product Name - HP - Functionality
    When the user enters a valid product name in the Pfinder search box - "product1"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@Smoke_Sitehome @Regression_All @Regression_Sitehome
Scenario: TC19_SH - P1 - Pfinder - Search by Product Name - Poly - Functionality
    When the user enters a valid product name in the Pfinder search box - "product2"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@Smoke_Sitehome @Regression_All @Regression_Sitehome 
Scenario: TC20_SH - P1 - Pfinder - Autosuggest Search by Product Name - Poly - Functionality
    When the user enters a valid product name in the Pfinder search box - "product2"
    When the user selects a product from the auto-suggest box
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@SiteHomePage_Onebox @Smoke_Sitehome @Regression_All @Smoke_All @Regression_Sitehome
Scenario: TC21_SH - P1 - OneBoxSearch - Search by Serial Number - HP
    When the user enters a valid serial number in the one box search field - "product1"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"
    
@onebox @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC22_SH - P1 - OneBoxSearch - Search by Serial Number - Poly
    When the user enters a valid serial number in the one box search field - "product2"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@SiteHomePage_Onebox @Smoke_Sitehome @Smoke_All @Regression_All @Regression_Sitehome
Scenario: TC23_SH - P1 - OneBoxSearch - Search by Product Number - HP
    When the user enters a valid product number in the one box search field - "product1"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"
    
@onebox @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC24_SH - P1 - OneBoxSearch - Search by Product Number - Poly
    When the user enters a valid product number in the one box search field - "product2"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"

@CarousalBanner @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC25_SH - P3 - Carousel Banner - Availability
    Then check if carousel banner is present

@CarousalBannerSwippersitehome @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC26_SH - P3 - Carousel Banner - Functionality
    Then check if carousel banner swiper is working

@clcSelector @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC27_SH - P3 - CLC Selector - Availability
    Then check if clc selector is present

@clcSelector @Regression_All @Smoke_Sitehome @Regression_Sitehome
Scenario: TC28_SH - P3 - CLC Selector - Functionality
    Then check if clc selector is working
