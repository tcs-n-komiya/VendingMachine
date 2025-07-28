package interfaces;

/**
 *支払い処理
 */
public interface IPayment {

    /**
     * @param price 支払う金額
     * @return 支払いに成功したかどうか
     */
    boolean pay(int price);

    /**
     * @return 支払い手段の名前
     */
    String getMethodName();

    /**
     * @return 残高（単位：円など）
     */
    int getBalance();
}
