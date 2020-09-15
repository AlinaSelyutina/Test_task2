package page_objects.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import page_objects.AbstractPage;

public class LoanForm extends AbstractPage {
  private final By submitButton = By.xpath("//button[@type='submit']");
  private final By fullNameInput = By.name("fullname");
  private final By phoneInput = By.name("phone");
  private final By finInput = By.name("fin");
  private final By cardInput = By.name("card");

  private static final String RGB_RED_COLOR = "rgb(255, 0, 0)";
  private static final String BORDER_COLOR_ATTRIBUTE = "border-color";


  public LoanForm submitLoanForm(){
    waitForElementEnabled(fullNameInput);
    scrollToElementAndClick(submitButton);
    return this;
  }

  public void verifyInputsBorderColor(){
    Assert.assertEquals(driver.findElement(fullNameInput).getCssValue(BORDER_COLOR_ATTRIBUTE), RGB_RED_COLOR);
    Assert.assertEquals(driver.findElement(phoneInput).getCssValue(BORDER_COLOR_ATTRIBUTE), RGB_RED_COLOR);
    Assert.assertEquals(driver.findElement(finInput).getCssValue(BORDER_COLOR_ATTRIBUTE), RGB_RED_COLOR);
    Assert.assertEquals(driver.findElement(cardInput).getCssValue(BORDER_COLOR_ATTRIBUTE), RGB_RED_COLOR);
  }
}
