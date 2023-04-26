import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class FormPage {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "inputFirstName3")
    private WebElement firstName;

    @FindBy(id = "inputLastName3")
    private WebElement lastName;

    @FindBy(id = "inputEmail3")
    private WebElement email;

    @FindBy(id = "inputAge3")
    private WebElement age;

    @FindBy(name = "gridRadiosSex")
    private List<WebElement> sexRadioButtons;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> yearsOfExperience;

    @FindBy(id = "gridCheckAutomationTester")
    private WebElement automationTester;

    @FindBy(id = "selectContinents")
    private WebElement continentsElement;

    @FindBy(id = "selectSeleniumCommands")
    private WebElement commandsElement;

    @FindBy(id = "chooseFile")
    private WebElement fileInput;

    @FindBy(css = "button[class='btn btn-primary']")
    private WebElement sendButton;

    @FindBy(id = "validator-message")
    private WebElement validationMsg;

    public String getValidationMsg() {
        return validationMsg.getText();
    }

    public void send() {
        sendButton.click();
    }

    public void selectContinent(String continent) {
        new Select(continentsElement).selectByVisibleText(continent);
    }

    public void selectSeleniumCommand(int index) {
        new Select(commandsElement).selectByIndex(index);

    }

    public void uploadFile(String absolutePath) {
        fileInput.sendKeys(absolutePath);
    }

    public void selectAutoTesterProfession() {
        automationTester.click();
    }

    public void selectRandomYearsOfExperience() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(yearsOfExperience.size());
        yearsOfExperience.get(randomNumber).click();
    }

    public void selectSex(int index) {
        sexRadioButtons.get(index).click();
    }


    public void setFirstName(String name) {
        firstName.sendKeys(name);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setAge(String age) {
        this.age.sendKeys(age);
    }
}