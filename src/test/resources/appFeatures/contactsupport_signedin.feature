Feature: contact us signed-in home page

  Background: 
    Given the user is on the contact support landing page
    Then user accepts cookies
    Then user successfully sign in with the credentials of "user1"
    Then contact page title should be "let’s get you some help"
       

  @TabTitle @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC2_CS_SIG - P3 - Header Footer,CLC, Page Tab, Page Title and Choose Product Sub heading  - Functionality
  	Then user check for the headers presence
    Then user check for the footers presence
    Then the user checks the browser tab title - "Contact Official HP® Support - United States | HP® Support"
    Then contact page title should be "let’s get you some help"
    Then the user sees the "Choose from your saved products or add a new one to continue"
    Then check if clc selector is present
    Then check if clc selector is working

  @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC6_CS_SIG - P2 - Swipper, View all of my product and Add a new product link- Functionality
    Then the user can see the left "Swipper" button
    Then the user can see the right "Swipper" button
    Then the user can click the left Swipper button
    Then the user can click the right Swipper button
    Then the user can see the "View all of my product" link
    Then the user click on the "View all of my product" link
    Then the user can see the "Add a New Product" link
    Then the user click on the "Add a New Product" link
    

  @printer @Regression_All @Smoke_Contact @Regression_Contact
  Scenario: TC14_CS_SIG - P2 - Select Product Tiles - Subscription, Printers, Laptops, Desktops, Monitor, Poly Products  - Functionality
  	Then the user can see the tile "Subscription,Apps and Services"
    Then the user can click the tile "Subscription,Apps and Services"
    Then the user should navigated to the page having header "Which subscription, app or service can we help you with?"
    Then the user click on the back browser button
    Then the user check for "Printers" tile
    Then the user can click the tile "Printers"
    Then the user should be navigated to the printer page having header "Which printer question can we help you with?"
    Then the user click on the back browser button
    Then the user check for "Laptops" tile
    Then the user can click the tile "Laptops"
    Then the user should be to the printer page having header "Which laptop question can we help you with?"
    Then the user click on the back browser button
    Then the user sees the tile "Desktop"
    Then the user can click the tile "Desktops"
    Then the user should be navigated to the desktop page having header "Which desktop question can we help you with?"
    Then the user click on the back browser button
    Then user sees the tile "Monitors,mice and other hardware"
    Then the user can click the tile "Monitor"
    Then the user should be navigated to the Monitors,mice and other hardware page having header "Which monitor, mouse or other hardware question can we help you with?"
    Then the user click on the back browser button
    Then the user checks for "Poly products"
    Then the user clicks on "Poly products" tile
    Then the user should be navigated to the Poly products "Choose from your saved products"

