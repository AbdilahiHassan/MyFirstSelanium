import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class CucumberTest {
private  WebDriver  driver;
    @Given("I am at link page")
    public void iAmAtLinkPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selanium\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://demoqa.com/links");

    }

    @When("I Click Home link")
    public void iClickHomeLink() {
        WebElement Links = driver.findElement(By.id("simpleLink"));
        Links.click();
    }

    @Then("I move to the page:{string}")
    public void iMoveToThePage(String arg0) {
    }
}
