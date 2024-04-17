Feature: pdp home api feature

  Background: 
    Given the api env

  @PDP_Category_API
  Scenario: TC1 - P1 - pdp home category list api
    When user invokes pdp categories api
    Then validate pdp categories api
    
   @PDP_Category_API
  Scenario: TC2 - P1 - pdp home category details api
    When user invokes pdp categories details api
    Then validate pdp categories details api
    
     @PDP_Category_API
  Scenario: TC2 - P1 - pdp home Security Alerts - Advisories, Bulletins, Notices api
    When user invokes pdp security alerts details api
    Then validate pdp security alerts details api
