package DependencyInjection.WithoutDI;

public class Car {

    private Engine engine;

    public Car() {
        // Direct instantiation of the dependency
        this.engine = new PetrolEngine();
    }

    public void startCar() {
        engine.start();
    }

    // Method to change the engine to a diesel engine
    public void switchToDieselEngine() {
        this.engine = new DieselEngine();
    }
}
