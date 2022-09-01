import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class LoggerTest {

    private static Logger log = LoggerFactory.getLogger(BaseTest.class);

    public static void logWebdriverManagerInitialization(String driverName) {
        log.info("WebdriverManager initialized" + driverName);
    }

    public static void logSettingLevelForLogger() {
        log.info("SetLevel set for OFF");
    }

    public static void logSettingChromeDriverOutputProperty() {
        log.info("ChromeDriverService set for SILENT OUTPUT");
    }

    public static void logOpeningNewChromeBrowser() {
        log.info("Driver opened new Chrome browser");
    }

    public static void logMaximizationOpenedWindow() {
        log.info("Driver maximized opened window");
    }

    public static void logClosingOpenedBrowser() {
        log.info("Processing closing browser...");
    }

    public static void logWebDriverShutdownAttemptException(Exception e) {
        log.warn("Web driver shutdown attempt failed!" + e);
    }

    public static void logOpeningNewWebsite(String webUrl) {
        log.info("Driver open: " + webUrl);
    }

    public static void logGettingActualTitle(String actualTitle) {
        log.info("Driver get actualTitle: " + actualTitle);
    }

    public static void logGettingExpectedTitle(String expectedTitle) {
        log.info("ExpectedTitle: " + expectedTitle);
    }

    public static void logComparingWebTitles(String actualTitle, String expectedTitle) {
        if (!Objects.equals(actualTitle, expectedTitle)) {
            log.error("WebTitles are different!");
        } else log.info("WebTitles are equal");

    }

}
