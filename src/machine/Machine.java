

package machine;

public class Machine {
    protected String productName;
    protected int price;
    protected int stock;
    protected int totalSales = 0;
    protected int insertedAmount = 0;

    public Machine(String productName, int price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public void insertMoney(int amount) {
        insertedAmount += amount;
        System.out.println("投入金額: " + insertedAmount + "円");
    }

    public void purchase() {
        if (stock <= 0) {
            System.out.println(productName + "は売り切れです");
        } else if (insertedAmount < price) {
            System.out.println(productName + "の購入にはあと" + (price - insertedAmount) + "円必要です");
        } else {
            stock--;
            totalSales += price;
            int change = insertedAmount - price;
            insertedAmount = 0;
            System.out.println(productName + "を購入しました！つり銭: " + change + "円");
        }
    }

    public void showStatus() {
        System.out.println(productName + "の在庫: " + stock + "個 / 売上: " + totalSales + "円");
    }

    public void showProductInfo() {
        System.out.println("商品名: " + productName + " / 価格: " + price + "円");
    }
}
