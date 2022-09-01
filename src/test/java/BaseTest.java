import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.logging.Level;

public class BaseTest extends LoggerTest {


    WebDriver driver;


    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        logWebdriverManagerInitialization("Chromedriver");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        logSettingLevelForLogger();
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        logSettingChromeDriverOutputProperty();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        logOpeningNewChromeBrowser();
        driver.manage().window().maximize();
        logMaximizationOpenedWindow();
    }

    @AfterEach
    void tearDown() {
        logClosingOpenedBrowser();
        try {
            driver.quit();
        } catch (Exception e) {
            logWebDriverShutdownAttemptException(e);
        }
    }
}