package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DoSomethingPageDef {

    public DoSomethingPageDef() {

    }

    @Given("I have to do something")
    public void whenDoSomething() {


    }

    @Then("it always fails")
    public void failTests() {
        Assert.fail("This test always fails");
    }

    @Then("it always passes")
    public void passTests() {
        Assert.assertTrue(true);
    }
}