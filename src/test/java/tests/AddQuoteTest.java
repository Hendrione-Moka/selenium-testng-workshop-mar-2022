package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddQuoteTest {

  WebDriver driver;

  @BeforeTest
  public void initializeWebdriver() {
    //initialize Webdriver
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);

    //maximize
    driver.manage().window().maximize();
  }

  @AfterTest
  public void quitWebDriver() {
    //delay
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //quit
    driver.quit();
  }

  @Test
  public void addQuoteWithValidData() {
    //open browser
    driver.get("http://bdd.atlasid.tech/");

    //input Quote
    By locatorInputQuote = By.id("inputQuote");
    WebElement inputQuote = driver.findElement(locatorInputQuote);
    inputQuote.clear();
    inputQuote.sendKeys("There is a will, there is a way");

    //select color
    WebElement selectColor = driver.findElement(By.id("colorSelect"));
    Select select = new Select(selectColor);
    select.selectByVisibleText("Blue");

    //click add quote
    By locatorButtonAddQuote = By.id("buttonAddQuote");
    WebElement buttonAddQuote = driver.findElement(locatorButtonAddQuote);
    buttonAddQuote.click();

    //Get Quote Texts
    By locatorQuoteText = By.name("quoteText");
    List<WebElement> quoteElements = driver.findElements(locatorQuoteText);
    WebElement quoteNo2 = quoteElements.get(1);
    //get text
    String text = quoteNo2.getText();
    //assertions testNg - hard assertions.
    Assert.assertEquals(text, "There is a will, there is a way");
  }
}
