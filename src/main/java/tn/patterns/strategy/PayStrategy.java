package tn.patterns.strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
