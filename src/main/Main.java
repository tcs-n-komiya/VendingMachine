package main;

import drinkvendingmachine.DrinkVendingMachine;
import machine.Machine;
import snackvendingmashine.SnackVendingMachine;

public class Main {

    public static void operateMachine(Machine machine, int money) {
        machine.showProductInfo();
        machine.insertMoney(money);
        machine.purchase();
        machine.showStatus();
        System.out.println("------");
    }

    public static void main(String[] args) {
        Machine drink = new DrinkVendingMachine();
        Machine snack = new SnackVendingMachine();

        operateMachine(drink, 100);  //緑茶は不足→  買えない
        operateMachine(drink, 150);  // 緑茶を購入
        operateMachine(snack, 100);  // ポテチは不足 → 買えない
        operateMachine(snack, 200);  // ポテチ購入
    }
}
