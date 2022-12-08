Feature: US004 Parametre Kullanimi
  Scenario: TC01 Parametre Kullanimi
    Given kullanici "http://www.hepsiburada.com" sayfasinda
    Then kullanici 3 saniye bekler
    When url'nin "hepsi" icerdigini test edelim
    And sayfayi Kapatir
