

Предварительные настройки
-------------------------

### Необходимые плагины для Intellij IDEA:

 > Cucumber for Java

 > Gherkin

 > Lombok

Для плагина **Lombok** в настройках:

* в разделе **Build, Execution, Deployment -> Compiler -> Annotation Processors**
требуется поставить галочку **Enable annotation processing**
* в разделе **Other settings -> Lombok plugin**
требуется поставить галочку **Enable lombok plugin for this project**

### Скачивание Selenium Driver нужной версии

Важно, чтобы версия драйвера соответствовала версии браузера
Узнать о том, какая версия нужна тебе для браузера Chrome, и скачать ее можно с ресурса https://sites.google.com/a/chromium.org/chromedriver/downloads

Можно установить на MacOS Chrome driver с помощью brew
brew install chromedriver

### Установка пути до папки с selenium  драйверами

В зависимости от ОС выполни
```
  echo %PATH%
  или
  echo $PATH
```

 Для **Windows** тебе пригодится файл runMe.bat из http://mvn/artifactory/webapp/#/artifacts/browse/tree/General/testing-tools-binary/selenium-windows-drivers.zip

 Для **Linux**  и **Mac OS**  просто скачай драйверы для Chrome или Safari и пропиши путь до папки при необходимости:
 ```
  > gedit .bash_profile
  > PATH = /usr/local/bin/drivers:$PATH
  > source .bash_profile
 ```
### Запуск тестов

./gradlew clean test -i -Dbrowser=chrome


