package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Регистрация аккаунта Google")
public class SignUpGooglePage extends AkitaPage {

    @FindBy(id = "headingText")
    @Name("Заголовок")
    private SelenideElement headingText;

    @FindBy(id = "firstName")
    @Name("Имя")
    private SelenideElement firstName;

    @FindBy(id = "lastName")
    @Name("Фамилия")
    private  SelenideElement lastName;

    @FindBy(id = "username")
    @Name("Имя пользователя")
    private SelenideElement username;

    @FindBy(css = "input[name=Passwd]")
    @Name("Пароль")
    private SelenideElement passwd;

    @FindBy(css = "input[name=ConfirmPasswd]")
    @Name("Подтверждение пароля")
    private SelenideElement confirmPasswd;

    @FindBy(id = "accountDetailsNext")
    @Name("Далее")
    private SelenideElement accountDetailsNext;


    //Подсказки

    @FindBy(xpath = "//*[contains(text(), 'Enter first name')]")
    @Name("Enter first name")
    @Optional
    private SelenideElement putYourFirstName;

    @FindBy(xpath = "//*[contains(text(), 'Enter last name')]")
    @Name("Enter last name")
    @Optional
    private SelenideElement putYourLastName;

    @FindBy(xpath = "//*[contains(text(), 'Choose a Gmail address')]")
    @Name("Enter username")
    @Optional
    private SelenideElement putYourUserName;

    @FindBy(xpath = "//*[contains(text(), 'Enter a password')]")
    @Name("Enter a password")
    @Optional
    private SelenideElement putYourPassword;

    @FindBy(xpath = "//*[contains(text(), 'Confirm your password')]")
    @Name("Confirm your password")
    @Optional
    private SelenideElement pleaseConfirmYourPassword;

    @FindBy(xpath = "//*[contains(text(), 'Those passwords')]")
    @Name("Passwords didn't match")
    @Optional
    private SelenideElement pleaseMatchYourPassword;



}