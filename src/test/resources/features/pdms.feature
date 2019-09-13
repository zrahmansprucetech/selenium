@web @regression @payments
Feature: Payment Feature

  Background:
    Given I am on Logon Page

  @logon-1
  Scenario: Verify login is successful
    When I enter TestEAOAdmin@ddc.nyc.gov into email text fields on PDMS Log in screen
   When I enter T35tu53r! into password text fields on PDMS Log in screen
    And I click LOG in
    Then I verify I am logged in

  @logon-2
  Scenario: I can enter EAO environment
    When I enter TestEAOAdmin@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    And I click LOG in
    Then I click Staging
    Then I verify I am on staging Page

  @dashboard-1
  Scenario: EAOAdmin is on correct dashboard
    When I enter TestEAOAdmin@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to EAOAdmin Dashboard and verify correct dashboard is shown

  @dashboard-2
  Scenario: CFOAdmin  is on correct dashboard
    When I enter TestCFOAdmin@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to CFOAdmin Dashboard and verify correct dashboard is shown

  @dashboard-3
  Scenario: EAOUser is on correct dashboard
    When I enter TestEAOuser@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to EAOUser Dashboard and verify correct dashboard is shown

  @dashboard-4
  Scenario: CFOUser is on correct dashboard
    When I enter TestCFOUser@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to CFOUser Dashboard and verify correct dashboard is shown

  @dashboard-5
  Scenario: GrantAdmin is on correct dashboard
    When I enter TestgrantAdmin@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to GrantAdmin Dashboard and verify correct dashboard is shown

  @dashboard-6
  Scenario: GrantUser is on correct dashboard
    When I enter Testgrantuser@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to GrantUser Dashboard and verify correct dashboard is shown

  @dashboard-7
  Scenario: BudgetAdmin is on correct dashboard
    When I enter TestbudgetAdmin@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to BudgetAdmin Dashboard and verify correct dashboard is shown

  @dashboard-8
  Scenario: BudgetUser is on correct dashboard
    When I enter TestBudgetUser@ddc.nyc.gov into email text fields on PDMS Log in screen
    And I enter T35tu53r! into password text fields on PDMS Log in screen
    Then I navigate to BudgetUser Dashboard and verify correct dashboard is shown

