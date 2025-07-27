package payment;

import error.ErrorMessages;
import interfaces.IPayment;

public class IcPayment implements IPayment {
    private int balance;

    public IcPayment(int initialBalance) {
        if (initialBalance < 0)
            throw new IllegalArgumentException(ErrorMessages.INSUFFICIENT_FUNDS);
        this.balance = initialBalance;
    }

    @Override
    public boolean pay(int price) {
        if (balance >= price) {
            balance -= price;
            return true;
        }
        return false;
    }

    @Override
    public String getMethodName() { return "ICカード"; }
    @Override
    public int getBalance() { return balance; }
}
