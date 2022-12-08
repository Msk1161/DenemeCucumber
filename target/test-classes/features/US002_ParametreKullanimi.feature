@parametre  # runner clasindan butun bu kodlari calistirmak icin kullanilir
Feature: Parametre Kullanimi
  Background: Ortak adimlar
    Given kullanici Amazon Sayfasina Gider

  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Then kullanici "Nutella" Icin Arama Yapar
    And sonuclarin "Nutella" Icerdigini Test Eder
    And sayfayi Kapatir

  Scenario: TC02 Kullanici amazonda parametreli arama yapar
    Then kullanici "selenium" Icin Arama Yapar
    And sonuclarin "selenium" Icerdigini Test Eder
    And sayfayi Kapatir

# Feature dosyasında parametreli arama yaptığımızda ""(tırnak) içine aldığımız
# string değeri stepDefinitionda
#Bir kere parametreli method oluşturur ve yeni bir arama yapmak istediğimizde
#Tekrar method oluşturmadan feature dosyasından ""(tırnak) içinde belirttiğimiz
# string ifadeyi değiştirmemiz
#yeterli olucaktır. Böylece kodlarımız dinamik olucaktır