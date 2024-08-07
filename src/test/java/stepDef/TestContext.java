package stepDef;

import pages.PageObjectManager;

import java.io.IOException;

public class TestContext {

    public TestBase testBase;
    public PageObjectManager pageObjectManager;

    // TransferProductDef From and To store names
    public String fromStore;
    public String toStore;
    public String productName;
    public String storeNumber;

    public TestContext() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
    }
}