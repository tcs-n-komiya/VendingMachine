package drinkvendingmachine;

import machine.Machine;

public class DrinkVendingMachine extends Machine {

    public DrinkVendingMachine() {
        super("緑茶", 130, 5); // 商品名・価格・在庫数
    }

    @Override
    public void showProductInfo() {
        System.out.println("商品カテゴリ：飲料");
        super.showProductInfo();
    }
}
