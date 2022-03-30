package pages;

import base.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddQuotePage extends PageObject {

  public void openPage() {
    getDriver().get("http://bdd.atlasid.tech/");
  }

  public void inputQuote(String quote) {
    //input Quote
    By locatorInputQuote = By.id("inputQuote");
    WebElement inputQuote = getDriver().findElement(locatorInputQuote);
    inputQuote.clear();
    inputQuote.sendKeys(quote);
  }

  public void selectColor(String color) {
    //select color
    WebElement selectColor = getDriver().findElement(By.id("colorSelect"));
    Select select = new Select(selectColor);
    select.selectByVisibleText(color);
  }

  public void clickAddQuoteBtn() {
    By locatorButtonAddQuote = By.id("buttonAddQuote");
    WebElement buttonAddQuote = getDriver().findElement(locatorButtonAddQuote);
    buttonAddQuote.click();
  }

}
