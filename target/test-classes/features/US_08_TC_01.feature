@medunna
Feature: Kullanıcı giriş yaptığında Password sekmesi düzenlenebilir olmalıdır.

 Scenario: TC001 "New password confirmation" onaylanabilmelidir.

    Given  Kullanici "medunnaUrl" sayfasine gider
    Then   Kullanici oturum acma icin Sign in'e tiklar
    And    Kulanici Username ve pasword girer
    And    Kullanici Sign in butonuna tiklar
    And    Kullanici giris yaptigini dogrular
    And    Kullanici isminin ustune tiklar ve Pasword sekmesine gider
    And    Kullanici Current Pasword'u girer
    And    Kullanici New Pasword 'u girer
    And    Kullanici New Pasword Confirmation'u girer
    And    Kullanici New password ile New Pasword Confirmation'u dogrular


