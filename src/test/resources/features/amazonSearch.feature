Feature: Amazon Search

  @gp1
  Scenario: TC01 Kullanici amazonda Nutella aratir

    Given kullanici Amazon Sayfasina Gider
    Then kullanici Nutella Icin Arama Yapar
    And sonuclarin Nutella Icerdigini Test Eder
    And sayfayi Kapatir
@gp3
  Scenario: TC02 Kullanici amazonda Selenium aratir

    Given kullanici Amazon Sayfasina Gider
    Then kullanici Selenium Icin Arama Yapar
    And sonuclarin Selenium Icerdigini Test Eder
    And sayfayi Kapatir
@gp2
  Scenario: TC03 Kullanici amazonda iphone aratir

    Given kullanici Amazon Sayfasina Gider
    Then kullanici iphone Icin Arama Yapar
    And sonuclarin iphone Icerdigini Test Eder
    And sayfayi Kapatir
