package pages;

import base.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableViewPage extends PageObject {

  public void clickTableViewTab(){
    By tableViewTabLocator = By.id("tableView");
    WebElement tableViewTab = getDriver().findElement(tableViewTabLocator);
    tableViewTab.click();
  }

}
