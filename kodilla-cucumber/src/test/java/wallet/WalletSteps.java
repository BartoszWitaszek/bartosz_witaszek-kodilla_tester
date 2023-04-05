package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        cashier.withdraw(wallet, 30);
    }

    @When("I request $201")
    public void i_request_$201() {
        cashier.withdraw(wallet, 201);
    }

    @When("I request $0")
    public void i_request_$0() {
        cashier.withdraw(wallet, 0);
    }

    @When("I request $-100")
    public void i_request_$100() {
        cashier.withdraw(wallet, -100);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assertions.assertEquals(30, cashSlot.getContents());
    }

    @Then("there should be error message {string}")
    public void there_should_be_error_message(String string) {
        Assertions.assertEquals(string, cashier.getErrorMessage());
    }
}