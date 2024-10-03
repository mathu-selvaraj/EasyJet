// src/test/java/stepdefinitions/CalculatorSteps.java

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private int num1;
    private int num2;
    private int result;

    @Given("I have the numbers {int} and {int}")
    public void i_have_the_numbers_and(int a, int b) {
        num1 = a;
        num2 = b;
    }

    @When("I add them")
    public void i_add_them() {
        result = num1 + num2;
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expectedResult) {
        assertEquals(expectedResult, result);
    }
}
