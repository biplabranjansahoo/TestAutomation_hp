Feature: contact choose issue page

  Background: 
    Given the user is on the contact support landing page
    Then user accepts cookies
    Then user successfully sign in with the credentials of "user1"
    Then contact page title should be "let’s get you some help"

  #@Smoke_Contact @Regression_Contact
  #Scenario: TC1_CS_ISSUE - P2 - select product Subscription,Apps and Services
    #Then the user sees the contact support welcome message "let’s get you some help"
    #Then the user can see the tile "Subscription,Apps and Services"
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the user should navigated to the page having header "Which subscription, app or service can we help you with?"

#@Smoke_Contact @Regression_Contact 
  #Scenario: TC2_CS_ISSUE - P2 - HP All In Product Card - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the A user can see the "Hp All-In" Product card

#@Smoke_Contact @Regression_Contact
  #Scenario: TC3_CS_ISSUE - P2 - HP All In Product Card - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the user can click the "Hp All-In" Product card
    #Then the user sees the contact support welcome message "let’s get you some help"

#@Smoke_Contact @Regression_Contact
  #Scenario: TC4_CS_ISSUE - P2 - Instant Ink Product Card - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the user can see the "Instant Ink" Product card

#@Smoke_Contact @Regression_Contact
  #Scenario: TC5_CS_ISSUE - P2 - Instant Ink Product Card - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the user can click the tile "Instant Ink"
    #Then the user should navigated "HP Instant Ink series"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC6_CS_ISSUE - P2 - HP+ - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the user can locate "HP+"
    #
#@Smoke_Contact @Regression_Contact @Smoke_All @Regression_All
  #Scenario: TC7_CS_ISSUE - P2 - HP+ - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then the user can click the tile "HP+"
    #Then user should go to "Which product are you contacting us about?"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC8_CS_ISSUE - P2 Learn more about Instant Ink link  - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #And the user can see the "Learn more about Instant Ink" Instant link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC9_CS_ISSUE - P2 Learn more about Instant Ink link  - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #And the user can click the tile "Learn more about Instant Ink"
    #Then user will go to page having title "HP Instant Ink"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC10_CS_ISSUE - P2 All service container  - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #And then the user can see the all service container
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC11_CS_ISSUE - P2 Submit Btn  - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then user check for "Submit" Button
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC12_CS_ISSUE - P2 Submit Btn  - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then user click for "Submit" Button
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC13_CS_ISSUE - P2 Choose different product link  - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then user can see the "Choose a different product type" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC14_CS_ISSUE - P2 Choose different product link  - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then user can click the "Choose a different product type" link
    #Then user should go to "Which product are you contacting us about?"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC15_CS_ISSUE - P2 CLC - Availibility
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then check if clc selector is present
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC16_CS_ISSUE - P2 CLC - Functionality
    #Then the user can click the tile "Subscription,Apps and Services"
    #Then check if clc selector is working
    
#@Smoke_Contact @Regression_Contact
  #Printers
  #Scenario: TC17_CS_ISSUE - P2 - select product Printers
    #Then the user sees the contact support welcome message "let’s get you some help"
    #Then the user check for "Printers" tile
    #Then the user can click the tile "Printers"
    #Then the user should be navigated to the printer page having header "Which printer question can we help you with?"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC18_CS_ISSUE - P2  - Printer Setup Availibility
    #Then the user can click the tile "Printers"
    #Then user can see "Printer Setup" Tile
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC19_CS_ISSUE - P2  - Printer Setup Functionality
    #Then the user can click the tile "Printers"
    #Then the user can click the tile "Printer Setup"
    #Then will be navigated to "Printer Setup" Header
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC20_CS_ISSUE - P2  - Other - Availibility
    #Then the user can click the tile "Printers"
    #Then the user can see "Other" tile icon
    
@Smoke_Contact @Regression_Contact @Smoke_All @Regression_All
  Scenario: TC21 - P2  - Other - Functionality
    Then the user can click the tile "Printers"
    Then the user can click the tile "Other"
    #Then the user sees the "Choose from your saved products or add a new one to continue"
    #Then the user can see the "View all of my product" link
    #Then the user click on the "View all of my product" link
    #Then the user can see the "Add a New Product Link" link
    #Then the user click on the "Add a New Product Link" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC22_CS_ISSUE  - P2  - Choose a different product type - Availibility
    #Then the user can click the tile "Printers"
    #Then the user checks availibility of "Choose a different product" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC23_CS_ISSUE - P2  - Choose a different product type - Functionality
    #Then the user can click the tile "Printers"
    #Then the user click on the "Choose a different product" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC24_CS_ISSUE  - P2 - CLC Selector - Availablity
    #Then the user can click the tile "Printers"
    #Then check if clc selector is present
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC25_CS_ISSUE - P2 - CLC Selector - Functionality
    #Then the user can click the tile "Printers"
    #Then check if clc selector is working
    
#@Smoke_Contact @Regression_Contact
  #Laptops
  #Scenario: TC26_CS_ISSUE - P2 - Select product Laptops
    #Then the user sees the contact support welcome message "let’s get you some help"
    #Then the user check for "Laptops"
    #Then the user can click the tile "Laptops"
    #Then the user should be to the printer page having header "Which laptop question can we help you with?"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC27_CS_ISSUE - P2  - Problem with battery and Adapter Availibility
    #Then the user can click the tile "Laptops"
    #Then user can see "Problem with battery or adapter" issue tile
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC28_CS_ISSUE - P2  - Problem with battery and Adapter Functionality
    #Then the user can click the tile "Laptops"
    #Then the user can click the tile "Problem with battery or adapter"
    #Then will be navigated to header of "Problem with battery or adapter:"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC29_CS_ISSUE - P2  - Other - Availibility
    #Then the user can click the tile "Laptops"
    #Then the user can see "Other" tile icon
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC30_CS_ISSUE - P2  - Other - Functionality
    #Then the user can click the tile "Laptops"
    #Then the user can click "Other" tile icon
    #Then will be navigated to other page having header of "Other:"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC31_CS_ISSUE - P2  - Choose a different product type - Availibility
    #Then the user can click the tile "Laptops"
    #Then the user checks availibility of "Choose a different product" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC32_CS_ISSUE - P2  - Choose a different product type - Functionality
    #Then the user can click the tile "Laptops"
    #Then the user click on the "Choose a different product" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC33_CS_ISSUE - P2 - CLC Selector - Availablity
    #Then the user can click the tile "Laptops"
    #Then check if clc selector is present
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC34_CS_ISSUE - P2 - CLC Selector - Functionality
    #Then the user can click the tile "Laptops"
    #Then check if clc selector is working
    
#@Smoke_Contact @Regression_Contact
  #Desktops
  #Scenario: TC35_CS_ISSUE - P2 - Select product Laptops
    #Then the user sees the contact support welcome message "let’s get you some help"
    #Then the user sees the tile "Desktop"
    #Then the user can click the tile "Desktops"
    #Then the user should be navigated to the desktop page having header "Which desktop question can we help you with?"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC36_CS_ISSUE - P2  - Storage Issue Availibility
    #Then the user can click the tile "Desktops"
    #Then user can see desktop issue "Storage Issue" tile
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC37_CS_ISSUE - P2  - Storage Issue Functionality
    #Then the user can click the tile "Desktops"
    #Then user can click on issue "Storage Issue" Tile
    #Then will be navigated to issue header of "Storage issue"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC38_CS_ISSUE - P2  - Other - Availibility
    #Then the user can click the tile "Desktops"
    #Then the user can click "Other" tile icon
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC 39_CS_ISSUE - P2  - Other - Functionality
    #Then the user can click the tile "Desktops"
    #Then the user can click "Other" tile icon
    #Then will be navigated to desktop other page having header of "Other:"
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC40_CS_ISSUE - P2  - Choose a different product type - Availibility
    #Then the user can click the tile "Desktops"
    #Then the user checks availibility of "Choose a different product" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC41_CS_ISSUE - P2  - Choose a different product type - Functionality
    #Then the user can click the tile "Desktops"
    #Then the user click on the "Choose a different product" link
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC42_CS_ISSUE - P2 - CLC Selector - Availablity
    #Then the user can click the tile "Desktops"
    #Then check if clc selector is present
    
#@Smoke_Contact @Regression_Contact
  #Scenario: TC43_CS_ISSUE - P2 - CLC Selector - Functionality
    #Then the user can click the tile "Desktops"
    #Then check if clc selector is working
    
#@Smoke_Contact @Regression_Contact
  #Monitors Mice and Other hardware
  #Scenario: TC44_CS_ISSUE - P2 - Select product Monitor Mice and other hardware
    #Then the user sees the contact support welcome message "let’s get you some help"
    #Then the user goes to "Monitors,mice and other hardware"
    #Then the user can click the tile "Monitor"
    #Then the user should be navigated to the Monitors,mice and other hardware page having header "Which monitor, mouse or other hardware question can we help you with?"

#@Smoke_Contact @Regression_Contact
  #Scenario: TC45_CS_ISSUE - P2  - LCD issue Availibility
    #Then the user can click the tile "Monitor"
    #Then user can see monitor "LCD issue" Tile

#@Smoke_Contact @Regression_Contact
  #Scenario: TC46_CS_ISSUE - P2  - LCD issue Functionality
    #Then the user can click the tile "Monitor"
    #Then user can click on the monitor "LCD issue" Tile
    #Then will be navigated to monitor "LCD issue" Header

#@Smoke_Contact @Regression_Contact
  #Scenario: TC47_CS_ISSUE - P2  - Other Issue Availibility
    #Then the user can click the tile "Monitor"
    #Then the user can see "Other" tile icon

#@Smoke_Contact @Regression_Contact
  #Scenario: TC48_CS_ISSUE - P2  - Other Issue Functionality
    #Then the user can click the tile "Monitor"
    #Then the user can click "Other" tile icon
    #Then will be navigated to other page having header of "Other:"

#@Smoke_Contact @Regression_Contact
  #Scenario: TC49_CS_ISSUE - P2  - Choose a different product type - Availibility
    #Then the user can click the tile "Monitor"
    #Then the user checks availibility of "Choose a different product" link

#@Smoke_Contact @Regression_Contact
  #Scenario: TC50_CS_ISSUE - P2  - Choose a different product type - Functionality
    #Then the user can click the tile "Monitor"
    #Then the user click on the "Choose a different product" link

#@Smoke_Contact @Regression_Contact
  #Scenario: TC51_CS_ISSUE - P2 - CLC Selector - Availablity
    #Then the user can click the tile "Monitor"
    #Then check if clc selector is present

#@Smoke_Contact @Regression_Contact
  #Scenario: TC52_CS_ISSUE - P2 - CLC Selector - Functionality
    #Then the user can click the tile "Monitor"
    #Then check if clc selector is working
