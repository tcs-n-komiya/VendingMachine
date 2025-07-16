package snackvendingmashine;

import machine.Machine;

public class SnackVendingMachine extends Machine {

    public SnackVendingMachine() {
        super("ポテトチップス", 180, 3);
    }

    @Override
    public void showProductInfo() {
        System.out.println("商品カテゴリ：軽食");
        super.showProductInfo();
    }
}
