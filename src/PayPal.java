public class PayPal extends Payment {
    @Override
    void processPayment() {
        initializePayment();
        System.out.println("Paypal Payment is being processed");
        confirmPayment();
    }

    @Override
    void initializePayment() {
        System.out.println("Initializing  paypal payment");
    }
}
