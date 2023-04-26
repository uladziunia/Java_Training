import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {
    // 50 > 30 > 30 > 80
    @Test
    public void shouldMoveSliderToExpectedValue() {
        getDriver().get("http://seleniumui.moderntester.pl/slider.php");

        moveTo(50);
        moveTo(30);
        moveTo(30);
        moveTo(80);
    }

    private void moveTo(int expectedSliderValue) {
        if (getSliderValue() > expectedSliderValue) {
            moveSlider(expectedSliderValue, Keys.ARROW_LEFT);
        } else if (getSliderValue() < expectedSliderValue) {
            moveSlider(expectedSliderValue, Keys.ARROW_RIGHT);
        }
    }

    private void moveSlider(int expectedSliderValue, Keys key) {
        while (getSliderValue() != expectedSliderValue) {
            getDriver().findElement(By.id("custom-handle")).sendKeys(key);
        }
    }

    private int getSliderValue() {
        String sliderValue = getDriver().findElement(By.id("custom-handle")).getText();
        return Integer.parseInt(sliderValue);
    }
}
