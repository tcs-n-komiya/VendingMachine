package product;

import error.ErrorMessages;

public class Product {
    private String name;
    private int price;
    private int stock;

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

    public String getName() { return name; }
    public int getPrice() { return price; }
    public int getStock() { return stock; }

    public boolean isAvailable() { return stock > 0; }
    public void reduceStock() { if (isAvailable()) stock--; }
}
