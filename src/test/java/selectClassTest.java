
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class selectClassTest {

    @Test

    public void testGoogleSearch() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selanium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // driver.get("https://demoqa.com/text-box");
        driver.get("https://demoqa.com/select-menu");


        selectVallue(driver,By.id("oldSelectMenu"),"4");
        Thread.sleep(4000);
        selectVallue(driver,By.id("oldSelectMenu"),"5");
        Thread.sleep(5000);
        selectVallue(driver,By.id("cars"),"volvo");
        selectVallue(driver,By.id("cars"),"saab");
        Thread.sleep(4000);
        driver.quit();


    }

    private void selectVallue(WebDriver driver, By by,String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByValue(value);
    }
}