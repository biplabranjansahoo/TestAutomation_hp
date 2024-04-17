Feature: printer support home page

Background: 
    Given the user is on the Printer Support Home page
    And   user accepts cookies


@Header @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC1_PL -P3 - Header Footer - Availability
    When user searches for "printer" in OneboxSearch
    Then user check for the headers presence
    Then user check for the footers presence


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC2_PL -P2 - Secondary Nav - Availability
    When user searches for "printer" in OneboxSearch
    Then user will see secondary navigation bar


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC3_PL -P2 - Secondary Nav - Support Home - Availability
    When user searches for "printer" in OneboxSearch
    Then user will see secondary navigation bar


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC4_PL -P2 - Secondary Nav - Products dropdown - Availability
    When user checks for the products tab in sec nav


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC5_PL -P2 - Secondary Nav - Products dropdown - Functionality
    When user searches for "printer" in OneboxSearch
    Then user hover on the products dropdown from sec nav
    Then the user select printer support - product dropdown
    Then the user checks the browser tab title - "Official HP® Printer Support"
    When user searches for "printer" in OneboxSearch
    Then user hover on the products dropdown from sec nav
    Then the user select computer support - product dropdown
    Then the user checks the browser tab title - "Official HP® Laptop & Desktop Computer Support"
    When user searches for "printer" in OneboxSearch
    Then user hover on the products dropdown from sec nav
    Then the user will have an option to select all - product dropdown
    Then the user checks the browser tab title - "HP Customer Support for Printers, Laptops, Desktops and More | HP® Support"


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC6_PL -P2 - Secondary Nav - Software and Drivers - Availability
    When user checks for the software and drivers tab in sec nav


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC7_PL -P2 - Secondary Nav - Software and Drivers - Functionality
    When user searches for "printer" in OneboxSearch
    Then user click on the software and drivers tab from sec nav
    Then the user checks the browser tab title - "Official HP® Drivers and Software Download | HP® Support"
    And the swd page title should be "Welcome to HP Software and Drivers"


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC8_PL -P2 - Secondary Nav - Diagnostics - Availability
    When user checks for the diagnostics tab in sec nav


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC9_PL -P2 - Secondary Nav - Contact Us - Availability
    When user checks for the contact us tab in sec nav


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC10_PL -P2 - Secondary Nav - Business Support - Availability
    When user checks for the business support tab in sec nav


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC11_PL -P2 - Secondary Nav - My HP Account - Availability
    When user checks for the my hp account tab in sec nav
    Then the contact us tab text should availbale as My HP Account


@SecNav @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC12_PL -P2 - Secondary Nav - Dashboard - Functionality
    When user click on the my hp account dropdown from sec nav
    Then the user select dashboard - Sec Nav
    Then the user checks the browser tab title - "My Dashboard | HP® Customer Support"


@Widgets @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC13_PL -P3 - Widgets - Alert - Availability
    Then user checks for the presence of alert icon


@Widgets @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC14_PL -P3 - Widgets - Alert - Functionality
    Then user checks for the notification pop up after clicking alert icon


@Widgets @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC15_PL -P3 - Widgets - Print - Availability
    Then user checks for the presence of print icon


@Widgets @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC16_PL -P3 - Widgets - Print - Functionality
    Then user checks for the print pop up after clicking print icon


@Widgets @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC17_PL -P3 - Widgets - Feedback - Availability
    Then user checks for the presence of feedback icon


@Widgets @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC18_PL -P3 - Widgets - Feedback - Functionality
    Then user checks for the feedback pop up after on clicking feedback icon

@PrinterLandingPage_Title @Smoke_All @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC19_PL -P3 - Page title - Availability
    When the page title should be "Official HP® Printer Support"


@HeroBanner @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC20_PL -P2 - HeroBanner - Availability
    When the user inspects the hero banner heading


@PrinterLandingPage_HeroBanner @Smoke_All @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC21_PL -P2 - HeroBanner - Functionality
    Then the hero banner heading should display as "HP Printer Support"


@PrimaryOption @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC22_PL -P2 - Primary Option - Download Drivers, Check Warranty,Contact Us,VA- Availability
    Given the user navigates to the primary option heading arrow links section
    When the user searches for the "Download Drivers" link
    Then the user verifies the availability of the "Check Warranty Status" link
    And the user ensures the presence of the "Contact Us" link
    And the user examines the existence of the "Ask Our Virtual Agent" link


@PrimaryOption @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC23_PL -P2 - Primary Option - Download Drivers, Check Warranty,Contact Us,VA- Functionality
    When the user click on "Download Drivers" link
    Then the user checks the browser tab title - "Official HP® Printer Drivers and Software Download | HP® Support"
    Then the user click on the back browser button
    Then the user click on "Check Warranty Status" link
    Then the user checks the browser tab title - "Official HP® Warranty Check - United States | HP® Support"
    Then the user click on the back browser button
    And the user click on "Contact Us" link
    Then the user checks the browser tab title - "Contact Official HP® Support - United States | HP® Support"
    Then the user click on the back browser button
    And the user click on "Ask Our Virtual Agent" link


@Topics @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC24_PL -P2 - Topics - Printer Setup button - Availability
    When user checks for the printer setup header text as "How to setup your printer"
    Then the printer setup button should be available


@Topics @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC25_PL -P2 - Topics - Printer Setup button - Functionality
    When the user clicks on the printer setup button
    Then the user checks the browser tab title - "Official HP® Printer Support"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC26_PL - P3 - Pfinder Component - Section title - Availability
    When user check for pfinder section title for printer support
    Then the pfinder section title for printer support should be available from db as "Identify your printer for manuals and specific product information"

@PrinterLandingPage_Pfinder @Smoke_All @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC27_PL - P1 - Pfinder - Search by Serial Number - HP - Functionality
    When the user enters a valid serial number in the Pfinder search box - "product1"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC28_PL - P1 - Pfinder - Search by Serial Number - Poly - Functionality
    When the user enters a valid serial number in the Pfinder search box - "product2"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC29_PL - P1 - Pfinder - Search by Product Number - HP - Functionality
    When the user enters a valid product number in the Pfinder search box - "product1"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC30_PL - P1 - Pfinder - Search by Product Number - Poly - Functionality
    When the user enters a valid product number in the Pfinder search box - "product2"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC31_PL - P1 - Pfinder - Search by Product Name - HP - Functionality
    When the user enters a valid product name in the Pfinder search box - "product1"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC32_PL - P1 - Pfinder - Search by Product Name - Poly - Functionality
    When the user enters a valid product name in the Pfinder search box - "product2"
    And then clicks on the search button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC33_PL - P1 - Pfinder - Autosuggest Search by Product Name - Poly - Functionality
    When the user enters a valid product name in the Pfinder search box - "product2"
    When the user selects a product from the auto-suggest box
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC34_PL - P1 -Pfinder Component - Sign in to select a saved product - Availability
    When user check for sign in link for saved product


@Pfinder @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC35_PL - P1 -Pfinder Component - Sign in to select a saved product - Functionality
    When the user clicks on the sign in link to save the product
    And the user enters username
    And the user clicks on the Next button
    And the user enters the password
    And the user clicks on Submit button
    Then check if user has "landed" on the dashboard page

@PrinterLandingPage_OneBoxSearch @Smoke_All @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC36_PL - P1 - OneBoxSearch - Search by Serial Number - HP
    When the user enters a valid serial number in the one box search field - "product1"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@OneBoxSearch @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC37_PL - P1 - OneBoxSearch - Search by Serial Number - Poly
    When the user enters a valid serial number in the one box search field - "product2"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@OneBoxSearch @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC38_PL - P1 - OneBoxSearch - Search by Product Number - HP
    When the user enters a valid product number in the one box search field - "product1"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@OneBoxSearch @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC39_PL - P1 - OneBoxSearch - Search by Product Number - Poly
    When the user enters a valid product number in the one box search field - "product2"
    And then clicks on the oneBoxsearch button
    Then the user should be navigated to the pdp page with page title from db for "Welcome to the product support page!"


@CarousalBanner @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC40_PL -P3 - Carousal Banner - Availability
    Then check if carousel banner is present


@CarousalBanner @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC41_PL -P3 - Carousal Banner - Functionality
    Then check if carousel banner swiper is working


@clcSelector @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC42_PL -P3 - CLC Selector - Availability
    Then check if clc selector is present


@clcSelector @Regression_All @Smoke_PrinterSupport @Regression_PrinterSupport
Scenario: TC43_PL -P3 - CLC Selector - Functionality
    Then check if clc selector is working
