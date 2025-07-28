package payment;

import error.ErrorMessages;
import interfaces.IPayment;

/**
 * ICカードによる支払い
 * @see IPayment
 */
public class IcPayment implements IPayment {
    private int balance;

    /**
     * @param initialBalance 初期残高（0以上）
     * @throws IllegalArgumentException 初期残高が負の値の場合
     */
    public IcPayment(int initialBalance) {
        if (initialBalance < 0)
            throw new IllegalArgumentException(ErrorMessages.INSUFFICIENT_FUNDS);
        this.balance = initialBalance;
    }

    /**
     * @param price 支払う金額
     * @return 支払い成功時は {@code true}、失敗時は {@code false}
     */
    @Override
    public boolean pay(int price) {
        if (balance >= price) {
            balance -= price;
            return true;
        }
        return false;
    }

    /**
     * @return 支払い方法の表示名
     */
    @Override
    public String getMethodName() { return "ICカード"; }

    /**
     * @return 残高（単位：円）
     */
    @Override
    public int getBalance() { return balance; }
}
