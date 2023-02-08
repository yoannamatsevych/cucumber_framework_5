Feature: Wikipedia Functionality

  Background:
    Given user navigates to "https://www.wikipedia.org/"

  Scenario Outline: validate search functionality
    When user searches for "<input data>" on Wikipedia
    Then user should see "<input data>" in the title
    And user should see "<input data>" in the url
    And user should see "<input data>" in the first heading

  Examples:
      | input data          |
      | Elon Musk           |
      | Bill Gates          |
      | Volodymyr Zelenskyy |

@WikipediaL
  Scenario: Validate Wikipedia main languages
    Then user should see below languages around the logo
      | English | Русский | 日本語 | Deutsch | Français | Español | Italiano | 中文 | فارسی | Polski |