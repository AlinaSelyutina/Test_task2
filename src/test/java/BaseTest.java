import static logger.TestLogger.info;
import static webdriver.WebDriverSingleton.kill;

import logger.TestLogger;
import org.testng.annotations.AfterMethod;

public class BaseTest {
  static final String AZ_URL = "https://www.ibar.az";
  static final String EN_URL = "https://www.ibar.az/en";

  @AfterMethod
  public void cleanUp() {
    info("Close driver");
    kill();
  }
}
