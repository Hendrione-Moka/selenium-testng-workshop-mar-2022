package steps;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddQuotePageSteps extends BaseTest {

  @Given("user open quote page")
  public void userOpenQuotePage() {
    addQuotePage.openPage();
  }

  @When("user input quote {string}")
  public void userInputQuote(String quote) {
    addQuotePage.inputQuote(quote);
  }

  @When("user select color {string}")
  public void userSelectColor(String color) {
    addQuotePage.selectColor(color);
  }

  @When("user click button add quote")
  public void userClickButtonAddQuote() {
    addQuotePage.clickAddQuoteBtn();
  }

}
