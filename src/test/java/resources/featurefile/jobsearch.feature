@regression
Feature: Job Search Test
  As user I want to search job into CV Library website

  @smoke

  Scenario Outline: User should search job using different data set
    Given I am on homepage
    When  I enter job title "<jobTitle>"
    And  I  enter Location "<location>"
    And I select distance "<miles>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I  enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I verify the result "<result>"
    Examples:
    |jobTitle | location                            | miles   | salaryMin | salaryMax | salaryType | jobType   | result                         |
    |Tester   | Harrow on the Hill,Greater London   | 5 miles |   30000   |  50000    |  Per annum | permanent |Permanent Tester jobs in Harrow |
    |Teacher  | Harrow,Greater London               | 2 miles |   30000   |  40000    |  per annum | Contract  | Contract Teacher jobs in Harrow|



