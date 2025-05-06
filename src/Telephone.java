public class Telephone implements  SmartDevice{

    private boolean status = false;
    @Override
    public void turnOn() {
        System.out.println("Telephone is on");
        this.status = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Telephone is off");
        this.status = false;
    }

    public void getStatus(){
       String status =  this.status ? "ON" : "OFF";
       System.out.println("This telephone is "+status);
    }
}
