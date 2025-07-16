package vendingmachine;

public class VendingMachine {

	// 売上金額（累積）
	private int totalSales;

	// 商品の在庫数（例として1種類のみ）
	private int stock;

	// 商品の値段
	private int price;

	// 現在のつり銭額
	private int change;

	// ユーザーが投入した金額
	private int insertedAmount;



	// コンストラクタ
	public VendingMachine( int stock, int price, int change) {
		this.totalSales = 0;
		this.stock = stock;
		this.price = price;
		this.change = change;
		this.insertedAmount = 0;
	}
	 // 支払い（投入金額）
    public void insertMoney(int amount) {
        insertedAmount += amount;
        System.out.println("投入金額: " + insertedAmount + "円");
    }

    // 商品の購入
    public void purchase() {
        if (stock == 0) {
            System.out.println("在庫がありません");
        } else if (insertedAmount < price) {
            System.out.println("金額が不足しています");
        } else {
            stock--; // 在庫減らす
            totalSales += price; // 売上加算
            change = insertedAmount - price; // つり銭計算
            insertedAmount = 0; // 支払い済みにリセット
            System.out.println("購入しました！つり銭: " + change + "円");
        }
    }

    public void showStatus() {
        System.out.println("残り在庫: " + stock + "個");
        System.out.println("売上: " + totalSales + "円");
    }

    // メイン処理
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine(5, 120, 0);

        vm.insertMoney(100);      // 金額不足で購入できない
        vm.purchase();            // → 金額不足メッセージ

        vm.insertMoney(200);      // 十分な金額を投入
        vm.purchase();            // → 購入成功＆つり銭表示

        vm.showStatus();          // 状態表示：在庫＆売上
    }
}
