package payment;

import error.ErrorMessages;
import interfaces.IPayment;

public class CashPayment implements IPayment {
    private int inserted = 0;

    public void insert(int amount) {
        if (amount <= 0)
            throw new IllegalArgumentException(ErrorMessages.INVALID_INSERT_AMOUNT);
        inserted += amount;
    }

    @Override
    public boolean pay(int price) {
        if (inserted >= price) {
            inserted -= price;
            return true;
        }
        return false;
    }

    @Override
    public String getMethodName() { return "現金"; }
    @Override
    public int getBalance() { return inserted; }
}
