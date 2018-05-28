package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Подтверждение номера телефона")
public class ConfirmPhoneNumber extends AkitaPage {

    @FindBy(id = "headingText")
    @Name("Заголовок")
    private SelenideElement headingTextConfirmPhoneNumberPage;
}
