import static logger.TestLogger.info;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.pages.CardsPage;
import page_objects.pages.LandingPage;

public class GlobalQuickSearchTest extends BaseTest {
  private LandingPage landingPage;
  private CardsPage cardsPage;
  @BeforeMethod
  public void setUp(){
    landingPage = new LandingPage();
    info("Navigate to Loan form");
    landingPage.open(EN_URL);
    cardsPage = landingPage.openCardsPage();
  }
  @Test
  public void test(){
    info("Check the count of American Express cards");
    cardsPage.checkCardsCountWithSpecifiqeName("American Express", 3);
  }


}
