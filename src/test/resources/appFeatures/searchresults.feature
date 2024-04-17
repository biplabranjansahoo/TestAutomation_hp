Feature: search results page

  Background: 
    Given the user is on the HP Support Home page
    And user accepts cookies

@Header @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC1_SR - P3 - Header Footer - Availability
    When user searches for "printer" in OneboxSearch
    Then user check for the headers presence
    Then user check for the footers presence

@SecNav @Regression_All  @Smoke_SearchResults @Regression_SearchResults
Scenario: TC2_SR - P2 - Secondary Nav - Availability
    When user searches for "printer" in OneboxSearch
    Then user will see secondary navigation bar

@Widgets @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC3_SR - P2 - Widgets - Availability
    When user searches for "printer" in OneboxSearch
    Then user checks for the presence of the widget

@SearchResultPage_Title @Regression_All @Smoke_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC4_SR - P2 - Page Title - Availability
    When user searches for "printer" in OneboxSearch  
    Then user checks browser tab title of search result page

@SearchResultPage_OneBoxSearch @Regression_All @Smoke_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC5_SR - P1 - OneBoxSearch - search by serial number - Functionality
    When user searches for device serial number "serial number" in OneboxSearch
    And then clicks on the oneBoxsearch button
    Then user will be navigated to corresponding PDP page
  
@SearchResultPage_SearchKeyword @Regression_All @Smoke_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC6_SR - P2 - Presence of searched keyword in searchResult page - Availability
    When user searches for "printer" in OneboxSearch
    Then validate in searchResult page the keyword is present

@searchKeywordInSearchBar @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC7_SR - P2 - Searched keyword in URL of search bar - Availability
    When user searches for "printer" in OneboxSearch
    Then the user will be able to see the Search bar with query the user searched for

@contentSelector @Regression_All  @Smoke_SearchResults @Regression_SearchResults
Scenario: TC8_SR - P2 - Content selector tabs - Availability
    When user searches for "printer" in OneboxSearch
    Then the user will be able to see the Content selector tab - "All" "Guides & Documents" "Videos"

@contentSelector @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC9_SR - P2 - Explore Shop Support tabs - Availability
    When user searches for "printer" in OneboxSearch
    Then the user will be able to see the Content selector tab - "Explore" "Shop" "Support"

@videoDrilldown @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC10_SR - P2 - Video drilldown - Functionality
    When user searches for "printer" in OneboxSearch
    Then the user will be able to see "Watch a Video" string and video description

@socumentDrilldown @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC11_SR - P2 - Document drilldown - Functionality
    When user searches for "printer" in OneboxSearch
    Then the user will be able to see the pagination element (if applicable) for document drilldown

@searchByNonUniqueSN @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC12_SR - P2 - Search for a non-unique SN in pfinder - Functionality
    When user searches for "troubleshoot" in OneboxSearch
    Then user is searching non-unique serial number
    Then system will ask to enter product number
    And user will be navigated to corresponding PDP page

@medaliaSurvey @Regression_All  @Smoke_SearchResults @Regression_SearchResults
Scenario: TC13_SR - P2 - Medalia Survey - Availability
    When user searches for "printer" in OneboxSearch
    Then the user will be able to see the Medallia survey

@recommendedSolutions @Regression_All  @Smoke_SearchResults @Regression_SearchResults
Scenario: TC14_SR - P2 - Recommended Solutions - Availability
    When user searches for "troubleshoot" in OneboxSearch
    Then the user will be able to see the Recommended Solutions is present

@clcSelector @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC16_SR - P3 - CLC Selector - Availablity
    When user searches for "printer" in OneboxSearch
    Then check if clc selector is present

@clcSelector @Regression_All @Smoke_SearchResults @Regression_SearchResults
Scenario: TC17_SR - P3 - CLC Selector - Functionality
    When user searches for "printer" in OneboxSearch
    Then check if clc selector is working
