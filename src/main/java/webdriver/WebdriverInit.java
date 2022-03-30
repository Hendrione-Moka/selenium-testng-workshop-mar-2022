package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebdriverInit {

  //static global variable
  public static WebDriver driver;

  //static function
  public static void initialize() {
    //initialize Webdriver
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito");
    driver = new ChromeDriver(options);

    //maximize
    driver.manage().window().maximize();
  }

  public static void quit() {
    //delay
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //quit
    driver.quit();
  }

}
