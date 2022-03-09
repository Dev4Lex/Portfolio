import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

public class SignUpPage {

    private By emailField = xpath("//input[@name='email']");
    private By confirmEmailField = xpath("//input[@name='confirm']");
    private By passwordField = xpath("//input[@id='password']");
    private By nameField = xpath("//input[@id='displayname']");
    private By monthDropDown = xpath("//select[@id='month']");
    private String monthDropDownOption = "//option[text()='%s']";
    private By dayField = xpath("//input[@id='day']");
    private By yearField = xpath("//input[@id='year']");
    private String genderRadioButton = "//div[contains(@class,'GenderSelect')]/label/span[text()=\"?\"]";
    private By marketingCheckbox = xpath("//*[@id=\"__next\"]/main/div[2]/form/div[7]/label/span[1]");
    private By thirdPartyCheckbox = xpath("//input[@name='thirdParty']");
    private By termsConditionsCheckbox = xpath("//*[@id=\"__next\"]/main/div[2]/form/div[9]/label/input");
    private By registerButton = xpath("//button[@type='submit']");
    private By emailErrorLabel = xpath("//div[contains(@class, 'InputErrorMessage')]/span[string-length(text())>0]");
    private String errorByEmail = "//div[contains(@class, 'InputErrorMessage')]/span[text()='Введите адрес электронной почты.']";
    private By errorLabel = xpath("//div[contains(@class, 'InputErrorMessage') and string-length(text()>0)]");
    private String errorByText = "//div[contains(@class, 'InputErrorMessage') and text()='%s']";
    private By closeBanner1 = xpath("//button[contains(@class,'mh-close')]");
    private By closeBanner2 = xpath("//button[contains(@class,'banner-close-button')]");

    public SignUpPage open() {
        Selenide.open("/");
        return this;
    }

    public SignUpPage typeEmail(String email) {
        $(emailField).setValue(email);
        return this;
    }

    public SignUpPage typeConfirmEmailField(String email) {
        $(confirmEmailField).setValue(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        $(passwordField).setValue(password);
        return this;
    }

    public SignUpPage typeName(String name) {
        $(nameField).setValue(name);
        return this;
    }

    public SignUpPage setMonth(String month) {
        $(monthDropDown).selectOption(month);
        return this;
    }

    public SignUpPage typeDay(String day) {
        $(dayField).setValue(day);
        return this;
    }

    public SignUpPage typeYear(String year) {
        $(yearField).setValue(year);
        return this;
    }

    public void setGender(String value) {
        $(byXpath(genderRadioButton.replace("?", value))).click();
    }

    public void setMarketing() {
        $(marketingCheckbox).click();
    }

    public SignUpPage setThirdParty(boolean value) {
        $(thirdPartyCheckbox).setSelected(value);
        return this;
    }

    public SignUpPage setConditions(boolean value) {
        $(termsConditionsCheckbox).setSelected(value);
        return this;
    }

    public void clickSignUpButton() {
        $(registerButton).waitUntil(Condition.visible, 5000);

        $(registerButton).click();
    }

    public ElementsCollection getErrors() {
        return $$(errorLabel);
    }

    public SelenideElement getErrorByNumber(int number) {
        return getErrors().get(number - 1);
    }

    public SelenideElement getError(String message) {
        return $(xpath(format(errorByText, message)));
    }

    public String getErrorByEmail() {
        return $(xpath(errorByEmail)).text();
    }

    public boolean isEmailErrorVisible(String message) {
        return $(xpath(format(errorByEmail, message))).isDisplayed();
    }

    public void getScroll() {
        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        jse.executeScript("window.scrollBy(0, window.innerHeight)", "");
    }

    public void closeBanners() {
        $(closeBanner1).click();
        $(closeBanner2).click();
    }
}
