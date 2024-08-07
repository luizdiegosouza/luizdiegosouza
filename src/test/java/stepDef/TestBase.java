package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {

        FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "//src//main//resources//config.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String browserName = prop.getProperty("browser");

        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
            }
        }
        return driver;
    }
}
