import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class DropableTest extends BaseTest {

    @BeforeMethod
    public void openDroppablePage(){
    getDriver().get("http://seleniumui.moderntester.pl/droppable.php");
    }
    @Test
    public void dragAndDropTest(){
        WebElement drag = getDriver().findElement(By.id("draggable"));
        WebElement drop = getDriver().findElement(By.id("droppable"));

        Actions actions = new Actions(getDriver());
        actions.dragAndDrop(drag, drop).perform();
        //dodać asercje
    }
    @Test
    public void holdAndDropTest(){

    }
}
