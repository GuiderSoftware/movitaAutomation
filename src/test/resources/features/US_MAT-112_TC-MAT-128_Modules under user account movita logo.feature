@Modules

  Feature: US_MAT-112_TC-MAT-128_Modules under user account movita logo
    Scenario: TC-128 Modules under user account movita logo
      Given User navigates to mainPage page
      Then User clicks girisYapFirst button
      Then user enters the username and password
      Then User clicks girisYapSecond button
      Then user should be login main page
      Then menus available should display on the left side of the screen
      Then map should display in the middle
      Then summary information should display covering total vehicles
      Then Anasayfa (filo_admin) submenus should be opened
      And  Raporlar submenus should be opened
      And  Araç Rota submenus should be opened
      And  Araç Video-Fotoğraf submenus should be opened
      And  Güzergah İslemleri submenus should be opened
      And  Alarm Islemleri submenus should be opened
      And  Rota islemleri submenus should be opened
      And  Personel İslemleri submenus should be opened
      And  Yönetim ve Ayarlar submenus should be opened
      When User login the main page any main and or subcomponent should not be selected
      When User hovers over the main components background color should change from white to gray












