package steps;

import base.BaseTest;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class GridViewPageSteps extends BaseTest {

  @Then("user see quote {string} on index {int}")
  public void userSeeQuoteOnIndex(String expected, int index) {
    String text = gridViewPage.getQuoteText(index);
    Assert.assertEquals(text, expected);
  }

}
