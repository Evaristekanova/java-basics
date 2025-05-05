public class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        initializePayment();
        System.out.println("Credit Card Payment is being processed");
        confirmPayment();
    }

    @Override
    void initializePayment() {
        System.out.println("Initializing credit card payment");
    }
}
