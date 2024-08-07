package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public WebDriver driver;
    public DoSomethingPage doSomethingPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public DoSomethingPage getTransferProductPage() {
        doSomethingPage = new DoSomethingPage(driver);
        return doSomethingPage;
    }
}