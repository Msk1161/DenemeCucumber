Feature:US005 Blue Rentalcar Login
  Scenario: TC11 Kullanici Gecerli Bilgilerle Giris Yapar
    Given kullanici "brcUrl" ana sayfasinda
    Then kullanici 2 saniye bekler
    Then Login yazisina tiklar
    Then kullanici 2 saniye bekler
    And gecersiz username girer
    Then kullanici 2 saniye bekler
    And gecersiz password girer
    Then kullanici 2 saniye bekler
    And Login butonuna basar
    Then kullanici 2 saniye bekler
    Then sayfaya giris yapilamadigini kontrol eder
    Then kullanici 2 saniye bekler
    And sayfayi Kapatir