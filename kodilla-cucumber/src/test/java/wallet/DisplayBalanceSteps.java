package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DisplayBalanceSteps {
    private final Wallet wallet = new Wallet();
    private int balance;

    @Given("there is $100 in my wallet")
    public void there_is_$100_in_my_wallet() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        this.balance = wallet.getBalance();
    }
    @Then("I should see that the balance is $100")
    public void i_should_see_that_the_balance_is_$100() {
        Assertions.assertEquals("Balance: $100", wallet.displayBalance());
    }
}
