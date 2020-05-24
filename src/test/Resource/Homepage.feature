Feature: Homepage Functionality

  # you can use # to comment out Scenario:
  @regression
  Scenario: Search product
    Given user is on the homepage of argos website.
    When user wants to search for product.
    Then user should see all the relavent searched produts.

  @smoke
  Scenario: Clicking on account button
    Given user is on the homepage of argos website.
    When user clicks on the account button.
    Then user should see teh detail of account.

  @Senity
  Scenario Outline: search multiple products
    Given user is on the homepage of argos website.
    When user try to find multiple "<product>".
    Then user should see all the relavent searched produts.

    Examples:
    |product|
    |nike   |
    |puma   |
    |Adidas |
