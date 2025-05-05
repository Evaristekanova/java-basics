public abstract class Payment {
    abstract void processPayment();
    abstract void initializePayment();
    void confirmPayment(){
        System.out.println("Payment Confirmed!!");
    }
}
