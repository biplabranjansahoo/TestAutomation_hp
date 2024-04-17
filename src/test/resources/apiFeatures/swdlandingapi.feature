Feature: swd landing api feature

  @SWDLandingPage_API
  Scenario: TC1 - P1 - swd landing page api
    When user invokes swd landing page api
    Then validate swd landing page api

  @SWDLandingSSCRegion_API
  Scenario: TC2 - P1 - swd landing ssc region api
    When user invokes swd landing ssc region api
    Then validate swd landing ssc region api

  @SWDLandingTermbase_API
  Scenario: TC3 - P1 - swd landing termbase api
    When user invokes swd landing termbase api
    Then validate swd landing termbase api

  @SWDLandingConfig_API
  Scenario: TC4 - P1 - swd landing config api
    When user invokes swd landing config api
    Then validate swd landing config api
    
