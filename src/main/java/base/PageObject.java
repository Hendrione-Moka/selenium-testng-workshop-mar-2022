package base;

import org.openqa.selenium.WebDriver;
import webdriver.WebdriverInit;

public class PageObject {

  public WebDriver getDriver() {
    return WebdriverInit.driver;
  }

}
