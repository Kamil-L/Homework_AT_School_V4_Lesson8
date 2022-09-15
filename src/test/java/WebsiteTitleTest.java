import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTitleTest extends BaseTest {

    private static Logger log = LoggerFactory.getLogger(WebsiteTitleTest.class);
    @ParameterizedTest
    @ValueSource(strings = {"Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"})
    @DisplayName("Checking title for sii.pl")
    @Tag("sii")
    @Tag("regression")
    void checkTitleForSii(String expectedTitle) {
        String webUrl = "https://www.sii.pl";
        driver.get(webUrl);
        log.info("Driver open: " + webUrl);
        String actualTitle = driver.getTitle();
        log.info("Driver open: " + webUrl);
        log.info("ExpectedTitle: " + expectedTitle);
        if (!Objects.equals(actualTitle, expectedTitle)) {
            log.error("WebTitles are different!");
        } else log.info("WebTitles are equal");
        assertThat(actualTitle).isEqualTo(expectedTitle);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Onet – Jesteś na bieżąco"})
    @DisplayName("Checking title for onet.pl")
    @Tag("onet")
    @Tag("regression")
    void checkTitleForOnet(String expectedTitle) {
        String webUrl = "https://www.onet.pl";
        driver.get(webUrl);
        log.info("Driver open: " + webUrl);
        String actualTitle = driver.getTitle();
        log.info("Driver get actualTitle: " + actualTitle);
        log.info("ExpectedTitle: " + expectedTitle);
        if (!Objects.equals(actualTitle, expectedTitle)) {
            log.error("WebTitles are different!");
        } else log.info("WebTitles are equal");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kotuszkowo- blog o kotach"})
    @DisplayName("Checking title for kotuszkowo.pl")
    @Tag("kotuszkowo")
    @Tag("regression")
    void checkTitleForKotuszkowo(String expectedTitle) {
        String webUrl = "http://kotuszkowo.pl";
        driver.get(webUrl);
        log.info("Driver open: " + webUrl);
        String actualTitle = driver.getTitle();
        log.info("Driver get actualTitle: " + actualTitle);
        log.info("ExpectedTitle: " + expectedTitle);
        if (!Objects.equals(actualTitle, expectedTitle)) {
            log.error("WebTitles are different!");
        } else log.info("WebTitles are equal");
        assertThat(actualTitle).isEqualTo(expectedTitle);


    }

    @ParameterizedTest
    @ValueSource(strings = {"Filmweb - filmy takie jak Ty!"})
    @DisplayName("Checking title for filmweb.pl")
    @Tag("filmweb")
    @Tag("regression")
    void checkTitleForFilmweb(String expectedTitle) {
        String webUrl = "https://www.filmweb.pl";
        driver.get(webUrl);
        log.info("Driver open: " + webUrl);
        String actualTitle = driver.getTitle();
        log.info("Driver get actualTitle: " + actualTitle);
        log.info("ExpectedTitle: " + expectedTitle);
        if (!Objects.equals(actualTitle, expectedTitle)) {
            log.error("WebTitles are different!");
        } else log.info("WebTitles are equal");
        assertThat(actualTitle).isEqualTo(expectedTitle);


    }

    @ParameterizedTest
    @ValueSource(strings = {"WebDriver | Selenium"})
    @DisplayName("Checking title for selenium.dev")
    @Tag("selenium")
    @Tag("regression")
    void checkTitleForSelenium(String expectedTitle) {
        String webUrl = "https://www.selenium.dev/documentation/en/webdriver";
        driver.get(webUrl);
        log.info("Driver open: " + webUrl);
        String actualTitle = driver.getTitle();
        log.info("Driver get actualTitle: " + actualTitle);
        log.info("ExpectedTitle: " + expectedTitle);
        if (!Objects.equals(actualTitle, expectedTitle)) {
            log.error("WebTitles are different!");
        } else log.info("WebTitles are equal");
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}