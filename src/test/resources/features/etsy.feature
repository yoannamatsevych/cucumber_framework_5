Feature: Validating Etsy Home Page

  Scenario: validate main menu items
    Given user navigates to "https://www.etsy.com"
    Then user should see main menu items
    | Gifts for Every Valentine | Jewelry & Accessories | Clothing & Shoes | Home & Living | Wedding & Party | Toys & Entertainment | Art & Collectibles | Craft Supplies | Gifts & Gift Cards |