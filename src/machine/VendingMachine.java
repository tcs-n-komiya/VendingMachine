package machine;

import error.ErrorMessages;
import interfaces.CategoryType;
import interfaces.IPayment;
import product.Product;

/**
 * 自動販売機の挙動
 * @see Product
 * @see CategoryType
 * @see IPayment
 */
public class VendingMachine {
    private Product product;
    private IPayment payment;
    private CategoryType category;

    /**
     * 商品とカテゴリを指定して自動販売機を初期化
     *
     * @param product 購入対象の商品
     * @param category 商品のカテゴリ（飲料や軽食など）
     * @throws IllegalArgumentException 商品が {@code null} の場合
     */
    public VendingMachine(Product product, CategoryType category) {
        if (product == null)
            throw new IllegalArgumentException(ErrorMessages.NULL_PRODUCT);
        this.product = product;
        this.category = category;
    }

    /**
     * 支払い手段を設定
     *
     * @param payment 支払い方法（現金、電子マネーなど）
     */
    public void setPaymentMethod(IPayment payment) {
        this.payment = payment;
    }

    /**
     * 商品情報とカテゴリをコンソールに表示
     */
    public void showProductInfo() {
        System.out.println("カテゴリ: " + category.getCategoryLabel());
        System.out.println("商品: " + product.getName() +
                           " / 価格: " + product.getPrice() +
                           "円 / 在庫: " + product.getStock());
    }

    /**
     * 商品を購入
     * 支払い成功時には在庫を減らす
     */
    public void purchase() {
        if (payment == null) {
            System.out.println(ErrorMessages.NO_PAYMENT_METHOD);
            return;
        }

        System.out.println("決済方法: " + payment.getMethodName());

        if (!product.isAvailable()) {
            System.out.println(ErrorMessages.OUT_OF_STOCK);
            return;
        }

        if (!payment.pay(product.getPrice())) {
            System.out.println(ErrorMessages.PAYMENT_FAILURE);
            System.out.println("現在の残高: " + payment.getBalance() + "円");
            System.out.println(ErrorMessages.SUGGESTION);
            return;
        }

        product.reduceStock();
        System.out.println(ErrorMessages.PURCHASE_SUCCESS + product.getName());
    }

    /**
     * 現在の残高をコンソールに表示
     */
    public void showStatus() {
        System.out.println("残高: " + (payment != null ? payment.getBalance() : "不明") );
    }
}
