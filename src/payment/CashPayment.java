package payment;

import error.ErrorMessages;
import interfaces.IPayment;

/**
 * 現金での支払い
 * @see IPayment
 */
public class CashPayment implements IPayment {
    private int inserted = 0;

    /**
     * @param amount 投入する金額（単位：円）
     * @throws IllegalArgumentException 無効な金額（0以下）の場合
     */
    public void insert(int amount) {
        if (amount <= 0)
            throw new IllegalArgumentException(ErrorMessages.INVALID_INSERT_AMOUNT);
        inserted += amount;
    }

    /**
     * @param price 商品の価格（単位：円）
     * @return 支払い成功なら true、失敗なら false
     */
    @Override
    public boolean pay(int price) {
        if (inserted >= price) {
            inserted -= price;
            return true;
        }
        return false;
    }

    /**
     * @return 支払い方式の名称
     */
    @Override
    public String getMethodName() { return "現金"; }

    /**
     * @return 残高（単位：円）
     */
    @Override
    public int getBalance() { return inserted; }
}
