package driver;

import config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class DriverTest {

    public static void main(String[] args)
    {
       BrowserType browser = BrowserType.valueOf(ConfigReader.getInstance().getBrowser().toUpperCase());
       WebDriver driver = DriverFactory.createDriver(browser);
       DriverManager.setDriver(driver);
       DriverManager.getDriver().get(ConfigReader.getInstance().getBaseUrl());
        DriverManager.quitDriver();
    }
}
