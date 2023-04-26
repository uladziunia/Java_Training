import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllertsTest extends BaseTest{

    @BeforeMethod
    public void openAlertsPage(){
        getDriver().get("http://seleniumui.moderntester.pl/alerts.php");
    }

    @Test
    public void shouldDisplaySimpleAlert(){
        WebElement alertButton = getDriver().findElement(By.id("simple-alert"));
        alertButton.click();

        getDriver().switchTo().alert().accept();

        String message = getDriver().findElement(By.id("simple-alert-label")).getText();
        Assert.assertEquals(message,"OK button pressed");
    }
    @Test
    public void shouldDisplaySimpleAlert2(){
        WebElement alertButton = getDriver().findElement(By.id("simple-alert"));
        alertButton.click();

        getDriver().switchTo().alert().dismiss();

        String message = getDriver().findElement(By.id("simple-alert-label")).getText();
        Assert.assertEquals(message,"button not pressed");
    }

}