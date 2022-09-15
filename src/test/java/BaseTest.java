import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

public class BaseTest {

    private static Logger log = LoggerFactory.getLogger(BaseTest.class);

    WebDriver driver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        log.info("WebdriverManager initialized");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        log.info("SetLevel set for OFF");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        log.info("ChromeDriverService set for SILENT OUTPUT");
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        log.info("Driver opened new Chrome browser");
        driver.manage().window().maximize();
        log.info("Driver maximized opened window");
    }

    @AfterEach
    void tearDown() {
        log.info("Processing closing browser...");
        try {
            driver.quit();
        } catch (Exception e) {
            log.warn("Web driver shutdown attempt failed!" + e);
        }
    }
}