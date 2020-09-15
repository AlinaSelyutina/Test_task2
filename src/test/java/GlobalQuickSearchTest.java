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
    landingPage.open(EN_URL);
    cardsPage = landingPage.openCardsPage();
  }
  @Test
  public void test(){
    cardsPage.checkCardsCountWithSpecifiqeName("American Express", 3);
  }


}
