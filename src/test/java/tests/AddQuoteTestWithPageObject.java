package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddQuotePage;
import pages.GridViewPage;
import pages.TableViewPage;
import webdriver.WebdriverInit;

public class AddQuoteTestWithPageObject {

  public AddQuotePage addQuotePage = new AddQuotePage();
  public GridViewPage gridViewPage = new GridViewPage();
  public TableViewPage tableViewPage = new TableViewPage();

  @BeforeTest
  public void initializeWebdriver() {
    WebdriverInit.initialize();
  }

  @AfterTest
  public void quitWebDriver() {
    WebdriverInit.quit();
  }

  @Test
  public void addQuoteWithValidData() {
    addQuotePage.openPage();
    addQuotePage.inputQuote("There is a will, there is a way");
    addQuotePage.selectColor("Blue");
    addQuotePage.clickAddQuoteBtn();
    String text = gridViewPage.getQuoteText(1);
    Assert.assertEquals(text, "There is a will, there is a way");
    gridViewPage.removeQuote(1);
  }

  @Test
  public void clickTableViewTab() {
    addQuotePage.openPage();
    tableViewPage.clickTableViewTab();
  }

}
