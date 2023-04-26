import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class FormPopTest extends BaseTest {

    private File file;

    @BeforeMethod
    public void openFormPage() {
        file = new File("src\\main\\resources\\file.txt");
        getDriver().get("http://seleniumui.moderntester.pl/form.php");
    }

    @Test
    public void shouldFillAndSendFormWithPop() {
        FormPage formPage = new FormPage(getDriver());

        formPage.setFirstName("Jan");
        formPage.setLastName("Kowalski");
        formPage.setAge("5");
        formPage.setEmail("asd@wp.pl");
        formPage.selectSex(1);
        formPage.selectRandomYearsOfExperience();
        formPage.selectContinent("Europe");
        formPage.selectSeleniumCommand(1);
        formPage.uploadFile(file.getAbsolutePath());
        formPage.selectAutoTesterProfession();
        formPage.send();

        String expectedMsg = "Form send with success";
        Assert.assertEquals(formPage.getValidationMsg(), expectedMsg);
    }

    @Test
    public void shouldFillAndSendFormWithFPOP() {
        FormPage formPage = new FormPage(getDriver());

        formPage.setFirstName("Jan")
                .setLastName("Kowalski")
                .setAge("5")
                .setEmail("asd@wp.pl")
                .selectSex(1)
                .selectRandomYearsOfExperience()
                .selectContinent("Europe")
                .selectSeleniumCommand(1)
                .uploadFile(file.getAbsolutePath())
                .selectAutoTesterProfession()
                .send();

        String expectedMsg = "Form send with success";
        Assert.assertEquals(formPage.getValidationMsg(), expectedMsg);
    }

    @Test
    public void shouldFillAndSendForm() {
        Assert.assertEquals(
                new FormPage(getDriver())
                        .setFirstName("Jan")
                        .setLastName("Kowalski")
                        .setAge("5")
                        .setEmail("asd@wp.pl")
                        .selectSex(1)
                        .selectRandomYearsOfExperience()
                        .selectContinent("Europe")
                        .selectSeleniumCommand(1)
                        .uploadFile(file.getAbsolutePath())
                        .selectAutoTesterProfession()
                        .send()
                        .getValidationMsg(), "Form send with success");
    }
    @BeforeMethod
    public void openFormPage() {
       // file = new File("src\\main\\resources\\file.txt");
        getDriver().get("http://seleniumui.moderntester.pl/css-diner-develop/index.html#");
    }
    @Test
    public void shouldFillAndSendFormWithPop() {
        FormPage formPage = new FormPage(getDriver());
}