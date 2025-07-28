package product;

import error.ErrorMessages;

/**
 * 自販機で販売される商品の情報を管理
 * @see error.ErrorMessages
 */
public class Product {
    private String name;
    private int price;
    private int stock;

    /**
     * @param name 商品名（空文字列や {@code null} は不可）
     * @param price 価格（1円以上）
     * @param stock 初期在庫数（0以上）
     * @throws IllegalArgumentException 商品名・価格・在庫が無効な場合
     */
    public Product(String name, int price, int stock) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException(ErrorMessages.INVALID_PRODUCT_NAME);
        if (price <= 0)
            throw new IllegalArgumentException(ErrorMessages.INVALID_PRICE);
        if (stock < 0)
            throw new IllegalArgumentException(ErrorMessages.INVALID_STOCK);

        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * @return 商品名
     */
    public String getName() { return name; }

    /**
     * @return 価格（単位：円）
     */
    public int getPrice() { return price; }

    /**
     * @return 在庫数
     */
    public int getStock() { return stock; }

    /**
     * @return 在庫ありなら {@code true}、それ以外は {@code false}
     */
    public boolean isAvailable() { return stock > 0; }

    /**
     * 在庫がある場合、在庫数を1減らします。
     */
    public void reduceStock() { if (isAvailable()) stock--; }
}
