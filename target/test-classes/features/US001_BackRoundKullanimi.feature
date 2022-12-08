@Background
Feature: US001 Background Kullanimi
  Background: Ortak adimlar
    Given kullanici Amazon Sayfasina Gider

  Scenario: TC01 kullanici amazonda Nutella aratir
    Then kullanici Nutella Icin Arama Yapar
    And sonuclarin Nutella Icerdigini Test Eder

  Scenario: TC02 kullanici amazonda Selenium aratir
    Then kullanici Selenium Icin Arama Yapar
    And sonuclarin Selenium Icerdigini Test Eder

  Scenario: TC03 kullanici amazonda iphone aratir
    Then kullanici iphone Icin Arama Yapar
    And sonuclarin iphone Icerdigini Test Eder
    And sayfayi Kapatir