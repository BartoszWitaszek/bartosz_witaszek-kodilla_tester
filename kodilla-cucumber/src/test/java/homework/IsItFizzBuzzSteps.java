package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzBuzzSteps {
    private int number;
    private String answer;

    @Given("The number is 1")
    public void the_number_is_1() {
        this.number = 1;
    }

    @Given("The number is 3")
    public void the_number_is_3() {
        this.number = 3;
    }

    @Given("The number is 5")
    public void the_number_is_5() {
        this.number = 5;
    }

    @Given("The number is 15")
    public void the_number_is_15() {
        this.number = 15;
    }

    @Given("The number is 24")
    public void the_number_is_24() {
        this.number = 24;
    }

    @Given("The number is 35")
    public void the_number_is_35() {
        this.number = 35;
    }

    @Given("The number is 61")
    public void the_number_is_61() {
        this.number = 61;
    }

    @Given("The number is 120")
    public void the_number_is_120() {
        this.number = 120;
    }

    @When("I ask whether it's Fizz or Buzz")
    public void i_ask_whether_it_s_fizz_or_buzz() {
        FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
        this.answer = fizzBuzzChecker.checkNumberFizzBuzz(this.number);
    }

    @Then("Answer is {string}")
    public void answer_is(String string) {
        assertEquals(string, this.answer);
    }

}