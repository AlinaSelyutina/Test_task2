package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.WebDriverSingleton;

public class AbstractPage {
  private static final int WAIT_FOR_ELEMENT_TIMEOUT_SECONDS = 30;

  protected WebDriver driver;

  public AbstractPage() {
    this.driver = WebDriverSingleton.getWebDriverInstance();
  }

  protected void waitForElementEnabled(By locator) {
    new WebDriverWait(driver, WAIT_FOR_ELEMENT_TIMEOUT_SECONDS).until(ExpectedConditions.elementToBeClickable(locator));
  }

  public void scrollToElementAndClick(By locator){
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(locator)).click().perform();
  }
}
