package main;

import category.DrinkCategory;
import category.SnackCategory;
import machine.VendingMachine;
import payment.CashPayment;
import payment.IcPayment;
import product.Product;

public class Main {
    public static void main(String[] args) {
        Product tea = new Product("緑茶", 150, 1);
        Product chips = new Product("ポテチ", 120, 0);

        VendingMachine drinkVM = new VendingMachine(tea, new DrinkCategory());
        VendingMachine snackVM = new VendingMachine(chips, new SnackCategory());

        System.out.println("=== 飲料自販機 ===");
        IcPayment ic = new IcPayment(100);
        drinkVM.setPaymentMethod(ic);
        drinkVM.showProductInfo();
        drinkVM.purchase();
        drinkVM.showStatus();

        System.out.println("--- ICカード再チャージ ---");
        ic = new IcPayment(200);
        drinkVM.setPaymentMethod(ic);
        drinkVM.purchase();
        drinkVM.showStatus();

        System.out.println("=== 軽食自販機 ===");
        CashPayment cash = new CashPayment();
        cash.insert(200);
        snackVM.setPaymentMethod(cash);
        snackVM.showProductInfo();
        snackVM.purchase();
        snackVM.showStatus();
    }
}
