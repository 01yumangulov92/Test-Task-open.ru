Feature: We are checking the correctness of the exchange rate
  Scenario: Ilya going to exchange rate
    When Ilya go to google for searching our site by word "Октрытие"
    Then He see "https://www.open.ru/" in search results and click on it
    Then Ilya on the Home Page with url "https://www.open.ru/"
    Then he see on exchange rate
    Then sale rate more purchase rate