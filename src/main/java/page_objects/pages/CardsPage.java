package page_objects.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import page_objects.AbstractPage;

public class CardsPage extends AbstractPage {
  private By cardsHeader = By.xpath("//h2[contains(text(),'Cards')]");

  public void checkCardsCountWithSpecifiqeName(String name, int count) {
    waitForElementEnabled(cardsHeader);
    Assert.assertEquals(
        (driver.findElements(By.xpath("//div[@class='pt-4']//h4[contains(text(), '" + name + "')]")))
            .size(), count, "Wrong count of cards with name contains " + name);
  }

}
