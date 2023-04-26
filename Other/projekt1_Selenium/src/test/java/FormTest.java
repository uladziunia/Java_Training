import org.testng.annotations.Test;

public class FormTest extends BaseTest {

    @Test
    public void shouldFillAndSendForm() {
        getDriver().get("http://seleniumui.moderntester.pl/form.php");

        FormPage formPage = new FormPage(getDriver());

        formPage.setFirstName("Jan");
        formPage.setLastName("Kowalski");
        formPage.setAge("5");
        formPage.setEmail("asd@wp.pl");


    }
}