Feature: User can login to an e-commerce site
  Scenario Outline: user can login with valid username and password
    Given User visited to the ecommerce site
    When User inputs valid "<username>" and "<password>"
    Then User can logged in successfully
    Examples:
      | username | password |
      | faruk15-9984@diu.edu.bd | 12345678 |