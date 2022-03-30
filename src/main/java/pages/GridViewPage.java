package pages;

import base.PageObject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GridViewPage extends PageObject {

  public String getQuoteText(int index) {
    //Get Quote Texts
    By locatorQuoteText = By.name("quoteText");
    List<WebElement> quoteElements = getDriver().findElements(locatorQuoteText);
    WebElement quote = quoteElements.get(index);
    //get text
    String text = quote.getText();
    return text;
  }

  public void removeQuote(int index){
    //Get Quote Texts
    By locatorQuoteText = By.name("quoteText");
    List<WebElement> quoteElements = getDriver().findElements(locatorQuoteText);
    WebElement quote = quoteElements.get(index);
    quote.click();
  }

}
