Feature: US006 Kullanici amazonda istedigi kemileri aratir

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir
    Given kullanici Amazon Sayfasina Gider
    Then kullanici "<istenenKelime>" Icin Arama Yapar
    Then sonuclarin "<listenerKelimeKontrol>" Icerdigini Test Eder
    And sayfayi Kapatir
    Examples:
      | istenenKelime | listenerKelimeKontrol |
      | nutella | nutella |
      | selenium | selenium |
      | sql | sql |

#TestNG deki dataProvider kullanimindaki gibi Cucumberda da    Scenario Outline kullaniriz
#Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz