public class Device {
    String name;
    String model;

    public Device(String name, String model) {
        this.name = name;
        this.model = model;
        System.out.println("This device is " + this.name + "and the model is  " + this.model);
    }
}
