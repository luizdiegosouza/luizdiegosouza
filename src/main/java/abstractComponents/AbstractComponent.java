package abstractComponents;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class AbstractComponent {
    WebDriver driver;
    Properties prop = new Properties();
    WebDriverWait wait;

    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
    }

    public Properties propertyManager() throws IOException {
        FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "//src//main//resources//config.properties");
        prop.load(fis);
        return prop;
    }

    public Properties propertyDataManager() throws IOException {
        FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "//src//test//resources//data//users.properties");
        prop.load(fis);
        return prop;
    }

    public void waitForInvisibilityOf(WebElement element) {
        try{
            wait = new WebDriverWait(driver, TestUtils.WAIT_5);
            wait.until(ExpectedConditions.invisibilityOf(element));
        } catch (org.openqa.selenium.NoSuchElementException
            | org.openqa.selenium.StaleElementReferenceException
            | org.openqa.selenium.TimeoutException ignored) {
        }
    }

}