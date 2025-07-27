package machine;

import error.ErrorMessages;
import interfaces.CategoryType;
import interfaces.IPayment;
import product.Product;

public class VendingMachine {
    private Product product;
    private IPayment payment;
    private CategoryType category;

    public VendingMachine(Product product, CategoryType category) {
        if (product == null)
            throw new IllegalArgumentException(ErrorMessages.NULL_PRODUCT);
        this.product = product;
        this.category = category;
    }

    public void setPaymentMethod(IPayment payment) {
        this.payment = payment;
    }

    public void showProductInfo() {
        System.out.println("カテゴリ: " + category.getCategoryLabel());
        System.out.println("商品: " + product.getName() +
                           " / 価格: " + product.getPrice() +
                           "円 / 在庫: " + product.getStock());
    }

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

    public void showStatus() {
        System.out.println("残高: " + (payment != null ? payment.getBalance() : "不明") );
    }
}
