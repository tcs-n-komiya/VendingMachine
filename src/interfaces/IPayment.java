package interfaces;

public interface IPayment {
    boolean pay(int price);
    String getMethodName();
    int getBalance();
}
