package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import webdriver.WebdriverInit;

public class WebdriverHook {

  @Before
  public void initializeWebdriver() {
    WebdriverInit.initialize();
  }

  @After
  public void quitWebDriver(Scenario scenario) {
    if (scenario.isFailed()) {
      //logic untuk screenshot
      //casting - interface reference
      TakesScreenshot screenshot = (TakesScreenshot) WebdriverInit.driver;
      byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
      scenario.attach(imageByte, "image/png", "error");
    }

    WebdriverInit.quit();
  }

//  @BeforeAll
//  public static void initializeWebdriver() {
//    WebdriverInit.initialize();
//  }
//
//  @AfterAll
//  public static void quitWebDriver() {
//    WebdriverInit.quit();
//  }

}
