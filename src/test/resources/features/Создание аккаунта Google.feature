#language:ru

Функционал: Регистрация аккаунта Google


  Структура сценария: : Ввод корректных данных для регистрации
    Допустим совершен переход на страницу "Регистрация аккаунта Google" по ссылке "GoogleSignUpPage"
    И выполнено ожидание в течение 10 секунд
    * в поле "Имя" введено значение "<name>"
    * в поле "Фамилия" введено значение "<lastName>"
    * в поле "Имя пользователя" введено значение "<userName>"
    * в поле "Пароль" введено значение "<password>"
    * в поле "Подтверждение пароля" введено значение "<confirmPassword>"
    * выполнено нажатие на кнопку "Далее"
    Тогда страница "Подтверждение номера телефона" загрузилась

    Примеры:

      | name   | lastName | userName      | password          | confirmPassword   |
      | Иван   | Иванов   | dododo        | qwerty12345^      | qwerty12345^      |
      | John   | Dowson   | 767994377     | !@##$%пвоароро009 | !@##$%пвоароро009 |
      | 123445 | 2376658  | gdhhy456.dfdf | gtt56784^&*^      | gtt56784^&*^      |




  Структура сценария: Отображение подсказок при заполнении формы регистрации
    Допустим совершен переход на страницу "Регистрация аккаунта Google" по ссылке "GoogleSignUpPage"
    * в поле "Имя" введено значение "<name>"
    * в поле "Фамилия" введено значение "<lastName>"
    * в поле "Имя пользователя" введено значение "<userName>"
    * в поле "Пароль" введено значение "<password>"
    * в поле "Подтверждение пароля" введено значение "<confirmPassword>"
    * выполнено нажатие на кнопку "Далее"
    Тогда поле "<hint>" содержит значение "<description>"

    Примеры:

      | name   | lastName | userName  | password          | confirmPassword   | hint                   | description                              |
      |        | Иванов   | dododo    | qwerty12345^      | qwerty12345^      | Enter first name       | Enter first name                         |
      | John   |          | 767994377 | !@##$%пвоароро009 | !@##$%пвоароро009 | Enter last name        | Enter last name                          |
      | 123445 | 2376658  |           | gtt56784^&*^      | gtt56784^&*^      | Enter username         | Choose a Gmail address                   |
      | Иван   | Иванов   | dododo    |                   |                   | Enter a password       | Enter a password                         |
      | John   | Dowson   | 767994377 | qwerty12345^      |                   | Confirm your password  | Confirm your password                    |
      | Иван   | Иванов   | dododo    | qwerty774$%%^     | qwerty12345^      | Passwords didn't match | Those passwords didn't match. Try again. |
