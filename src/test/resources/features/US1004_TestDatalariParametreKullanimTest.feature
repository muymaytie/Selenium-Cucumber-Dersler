


Feature: US1004 kullanici test datalarini parametre olarak kullanir


  Scenario: TC08 gidilecek url'i parametre olarak test datalarindan alabilmeli

    Given kullanici "websiteUrl" anasayfaya gider
    When arama kutusuna "baby" yazip enter tusuna basar
    Then arama sonucunda urun bulunabildigini test eder
    And 3 saniye bekler
    And sayfayi kapatir


  Scenario: TC09 kullanici istenen sayfaya gidildigini test eder
    Given kullanici "zeroWebAppUrl" anasayfaya gider
    Then istenen "zeroWebAppUrl" sayfasina gidildigini test eder
    And 4 saniye bekler
    And sayfayi kapatir