public class Car {
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void drive() {
        engine.engineStart();
        System.out.println("Car is running.....");
    }
}
