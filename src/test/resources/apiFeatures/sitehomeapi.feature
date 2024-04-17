Feature: site home api feature

  Background: 
    Given the api env

  @SiteHomeRowIcons_API
  Scenario: TC1 - P1 - site home row icons api
    When user invokes site home row icons api
    Then validate site home row icons api

  @SiteHomeTiles_API
  Scenario: TC2 - P1 - site home tiles api
    When user invokes site home tiles api
    Then validate site home tiles api

  @SiteHomeCarousel_API
  Scenario: TC3 - P1 - site home carousel api
    When user invokes site home carousel api
    Then validate site home carousel api

  @SiteHomeSupportResources_API
  Scenario: TC4 - P1 - site home supportresources api
    When user invokes site home supportresources api
    Then validate site home supportresources api

  @SiteHomeProductType_API
  Scenario: TC5 - P1 - site home product type api
    When user invokes site home product type api
    Then validate site home product type api

  @SiteHomeSecNav_API
  Scenario: TC6 - P1 - site home secondary nav api
    When user invokes site home secondary nav api
    Then validate site home secondary nav api

  @SiteHomeOtherProductSupport_API
  Scenario: TC7 - P1 - site home other product support api
    When user invokes site home other product support api
    Then validate site home other product support api

  @SiteHomeAlerts_API
  Scenario: TC7 - P1 - site home alerts post api
    When user invokes site home alerts post api
    Then validate site home alerts post api
