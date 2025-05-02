public class Computer extends  Device {
    private int storage;
    private int ram;
    private String name;

    public Computer(int storage, int ram, String name) {
        super(name, "M3");
        this.name = name;
        this.storage = storage;
        this.ram = ram;
        System.out.println(this.name + " has storage of " + this.storage + " GB and RAM of "+ this.ram);
    }

    void boot(){
        System.out.println("This has boot functionality.");
    }
}
