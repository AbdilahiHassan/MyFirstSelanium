
import org.openqa.selenium.*;

 import org.openqa.selenium.chrome.*;

import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test

    public void testGoogleSearch() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selanium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // driver.get("https://demoqa.com/text-box");
        driver.get("https://demoqa.com/select-menu");


        Select dropDown = new Select(driver.findElement(By.id("oldSelectMenu")));

        dropDown.selectByValue("4");


        // SelectValue(driver);
      sendKeys(driver,By.id("userName"),"Hassan");
      sendKeys(driver,By.id("userEmail"),"Hassan@gmail.com");
      sendKeys(driver,By.id("currentAddress"),"sommarvägen");
      sendKeys(driver,By.id("permanentAddress"),"höstvägen");
      scroll(driver);
      click(driver,By.id("submit"));

        printText(driver,By.cssSelector("p[id='name']"));
        printText(driver,By.cssSelector("p[id='email']"));
        printText(driver,By.cssSelector("p[id='currentAddress']"));
        printText(driver,By.cssSelector("p[id='permanentAddress']"));

        driver.quit();

    }




    private void printText(WebDriver driver,By by) {
        WebDriverWait footbarr = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = footbarr.until(ExpectedConditions.presenceOfElementLocated(by));
        String name = element.getText();
        System.out.println(name);
    }


    private static  void scroll(WebDriver driver){

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");
    }
    private  static  void sendKeys(WebDriver driver,By by, String text){
        WebDriverWait footbarr = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = footbarr.until(ExpectedConditions.presenceOfElementLocated(by));
        element.sendKeys(text);

    }
    private  static  void click(WebDriver driver, By by){
        WebDriverWait footbar = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element= footbar.until(ExpectedConditions.elementToBeClickable(by));
        element.click();


    }
}

/*
   //printText method
 WebDriverWait footbarr = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = footbarr.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p[id='name']")));
        String name = element.getText();
        System.out.println(name);
 //
    private void SelectValue(WebDriver driver) {
        Select dropDown = new Select(driver.findElement(By.id("oldSelectMenu")));

        dropDown.selectByValue("4");
    }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("userName")));

        element.sendKeys("Hassan");

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,200)");

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement submit = wait1.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        submit.click();
        Thread.sleep(3000);
        click(driver, By.id("submit"));
        click(driver, By.id("refresh"));
        driver.quit();

    }
    public  static void click(WebDriver driver, By by){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(by));
    }
}


       List<WebElement>chechBoxs = driver.findElements(By.cssSelector("label[class='custom-control-label'"));
           Thread.sleep(2000);
        for (WebElement e: chechBoxs) {
          e.click();
        }
        Thread.sleep(3000);
        driver.quit();



      //  extracted(driver);
        WebElement dropDornElment = driver.findElement(By.id("cars"));
        Select dropDown = new Select(dropDornElment);
        dropDown.selectByValue("saab");
        Thread.sleep(3000);
        driver.quit();
       // dropDown.deselectByIndex(2);

WebElement first = driver.findElement(By.cssSelector("p:first-of-type"));
WebElement fifth = driver.findElement(By.cssSelector("p:nth-of-type(5)"));
WebElement end = driver.findElement(By.cssSelector("p:last-of-type"));
        System.out.println(first.getText());
        System.out.println(fifth.getText());
        System.out.println(end.getText());



        WebElement FullName  = driver.findElement(By.className("form-control"));
        FullName.sendKeys("Dhilo");
        Thread.sleep(2000);
 WebElement email = driver.findElement(By.id("userEmail"));
 email.sendKeys("daarood11@hotmail.com");
  Thread.sleep(3000);


        WebElement textArea = driver.findElement(By.tagName("textarea"));
        textArea.sendKeys("hemma");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
        Thread.sleep(600);
        driver.quit();

        WebElement first = driver.findElement(By.name("n01"));
        first.sendKeys("10");
        WebElement second = driver.findElement(By.name("n02"));
        second.sendKeys("20");
        WebElement button = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
         button.click();
        WebElement answer = driver.findElement(By.name("answer"));
       String actual = answer.getAttribute("value");
       assertEquals("30", actual);
 String title = driver.getTitle();
        System.out.println("test" +title);

JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,200)");



    }

    private void extracted(WebDriver driver) {
        Select dropDown = new Select(driver.findElement(By.name("name")));

        dropDown.selectByValue("nameToSelect");
    }
*/
