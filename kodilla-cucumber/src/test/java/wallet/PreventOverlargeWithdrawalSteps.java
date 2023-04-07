package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class PreventOverlargeWithdrawalSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();
    private final Cashier cashier = new Cashier(cashSlot);
    @Given("in my wallet is $100")
    public void in_my_wallet_is_$100() {
        wallet.deposit(100);
        Assertions.assertEquals(100, wallet.getBalance(), "Incorrect wallet balance");
    }
    @When("I withdraw $200")
    public void i_withdraw_$200() {
        cashier.withdraw(wallet, 200);
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }
    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("This amount is incorrect!", cashier.getErrorMessage());
    }
}
