package webdriver;

import logger.TestLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSingleton {

  private static WebDriver instance;

  private static TestLogger logger = new TestLogger();
  private static final String CHROME_PATH = "src/main/resources/webdrivers/chromedriver.exe";

  private WebDriverSingleton() {
  }

  public static WebDriver getWebDriverInstance() {
    if (instance != null) {
      return instance;
    }
    return instance = init();
  }

  private static WebDriver init() {
    System.setProperty("webdriver.chrome.driver",
        CHROME_PATH);
    WebDriver driver = new ChromeDriver();
    logger.info("Driver init");
    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    return driver;
  }

  public static void kill() {
    if (instance != null) {
      try {
        instance.quit();
      } catch (Exception e) {
        logger.error("Cannot kill browser");
      } finally {
        instance = null;
      }
    }
  }
}
