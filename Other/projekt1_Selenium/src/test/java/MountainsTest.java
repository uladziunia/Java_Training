import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MountainsTest extends BaseTest {

    @Test
    public void shouldShowMountainsHigherThan4200() {
        getDriver().get("http://seleniumui.moderntester.pl/table.php#");
        List<WebElement> allMountains = getDriver().findElements(By.cssSelector("tbody tr"));

        for (WebElement mountain : allMountains) {
            List<WebElement> mountainDetails = mountain.findElements(By.cssSelector("td"));
            int mountainHeight = Integer.parseInt(mountainDetails.get(3).getText());

            if (mountainHeight > 4200) {
                System.out.println(mountainDetails.get(0).getText());
            }
        }
    }
}