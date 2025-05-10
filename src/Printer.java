public class Printer <T>{
    T whatType;

    public Printer(T whatType) {
        this.whatType = whatType;
    }
    public void displayType() {
        System.out.println("The value is: "+whatType);
    }
}
