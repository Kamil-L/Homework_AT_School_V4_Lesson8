import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class WebsiteTitleTest extends BaseTest {


    @ParameterizedTest
    @ValueSource(strings = {"Rozwiązania i usługi IT, inżynierii i BPO - Sii Polska"})
    @DisplayName("Checking title for sii.pl")
    @Tag("sii")
    @Tag("regression")
    void checkTitleForSii(String expectedTitle) {
        String webUrl = "https://www.sii.pl";
        driver.get(webUrl);
        logOpeningNewWebsite(webUrl);
        String actualTitle = driver.getTitle();
        logGettingActualTitle(actualTitle);
        logGettingExpectedTitle(expectedTitle);
        logComparingWebTitles(actualTitle, expectedTitle);
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
        logOpeningNewWebsite(webUrl);
        String actualTitle = driver.getTitle();
        logGettingActualTitle(actualTitle);
        logGettingExpectedTitle(expectedTitle);
        logComparingWebTitles(actualTitle, expectedTitle);
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
        logOpeningNewWebsite(webUrl);
        String actualTitle = driver.getTitle();
        logGettingActualTitle(actualTitle);
        logGettingExpectedTitle(expectedTitle);
        logComparingWebTitles(actualTitle, expectedTitle);
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
        logOpeningNewWebsite(webUrl);
        String actualTitle = driver.getTitle();
        logGettingActualTitle(actualTitle);
        logGettingExpectedTitle(expectedTitle);
        logComparingWebTitles(actualTitle, expectedTitle);
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
        logOpeningNewWebsite(webUrl);
        String actualTitle = driver.getTitle();
        logGettingActualTitle(actualTitle);
        logGettingExpectedTitle(expectedTitle);
        logComparingWebTitles(actualTitle, expectedTitle);
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }
}