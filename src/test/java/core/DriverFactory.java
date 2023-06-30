package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
    private static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver(){
        if(driver == null) {


            switch (Propriedades.browser){
                case CHROME:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("disable-notifications");
                    chromeOptions.addArguments("--headless");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    wait = new WebDriverWait(driver, 60);
                    driver.manage().window().maximize();
                    break;
                case FIREFOX:
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
//                    firefoxOptions.addArguments("disable-notifications");
                    WebDriverManager.firefoxdriver().setup();
//                    driver = new FirefoxDriver(firefoxOptions);
                    driver = new FirefoxDriver();
                    wait = new WebDriverWait(driver, 60);
                    driver.manage().window().maximize();
                    break;
            }

        }
        return driver;
    }

    public static void killDriver(){
        if(driver != null) {
            getDriver().quit();
            driver = null;
        }
    }
}
