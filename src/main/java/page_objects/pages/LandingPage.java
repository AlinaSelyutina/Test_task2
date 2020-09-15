package page_objects.pages;

import static logger.TestLogger.info;

import org.openqa.selenium.By;
import org.testng.Assert;
import page_objects.AbstractPage;
import page_objects.forms.LoanForm;

public class LandingPage extends AbstractPage {

  private By switchLanguageButton = By.cssSelector(".col-lg-2 b.button");
  private By cardsButton = By.xpath("//a[text()='Cards']");
  private By applyNowButton = By.xpath("//a[contains(text(), 'Apply online')]");

  public LandingPage open(String url) {
    info(String.format("Navigate to landing page %s", url));
    driver.get(url);
    return this;
  }

  public LandingPage selectLanguage(String language) {
    driver.findElement(switchLanguageButton).click();
    driver.findElement(By.xpath("//li[text()='" + language + "']")).click();
    return this;
  }

  public void checkThatPageSwitchToLanguage(String url, String aboutUsText) {
    Assert.assertEquals(driver.getCurrentUrl(), url, "URL is not correct");
    Assert.assertTrue(
        (driver.findElement(By.xpath("//a[text()='" + aboutUsText + "']")).isDisplayed()));
  }

  public CardsPage openCardsPage(){
    driver.findElement(cardsButton).click();
    return new CardsPage();
  }

  public LoanForm openLoanForm(){
    scrollToElementAndClick(applyNowButton);
    return new LoanForm();
  }
}

