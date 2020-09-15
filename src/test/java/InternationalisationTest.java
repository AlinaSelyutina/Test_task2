import static logger.TestLogger.info;

import business_objects.Languages;
import logger.TestLogger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_objects.pages.LandingPage;

public class InternationalisationTest extends BaseTest{
  private LandingPage landingPage;

  @DataProvider(name = "languages")
  private static Object[][] getLanguages() {
    return new Object[][]{
        {Languages.ENGLISH.getLanguage(), Languages.ENGLISH.getUrl(), "About us"},
        {Languages.RUSSIAN.getLanguage(), Languages.RUSSIAN.getUrl(), "О нас"}
    };
  }

  @BeforeMethod
  public void setUp() {
    landingPage = new LandingPage();
    info("Open Home page in Azerbaijani");
    landingPage.open(AZ_URL);
  }

  @Test(dataProvider = "languages")
  public void test(String language, String newUrl, String aboutUsText) {
    info("Switch language to " + language);
    landingPage.selectLanguage(language);
    info("Check that language was switched to " + language);
    landingPage.checkThatPageSwitchToLanguage(newUrl, aboutUsText);
  }
}
