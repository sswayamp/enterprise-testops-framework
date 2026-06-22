package driver;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public static WebDriver createDriver(BrowserType browserType) {
        WebDriver driver = null;
        return switch (browserType) {
            case CHROME -> {
            WebDriverManager.chromedriver().setup();
            yield new ChromeDriver();}

        case EDGE -> {
            WebDriverManager.edgedriver().setup();
            yield new EdgeDriver();
        }


        case FIREFOX -> {
            WebDriverManager.firefoxdriver().setup();
            yield new FirefoxDriver();
        }

        case SAFARI -> {
            WebDriverManager.safaridriver().setup();
            yield new SafariDriver();
        }

    };
    }
}
