package DependencyInjection.WithDI;

public class CarInjector {

    public static Car createPetrolCar() {
        // Create the dependency
        Engine engine = new PetrolEngine();
        // Inject the dependency
        return new Car(engine);
    }

    public static Car createDieselCar() {
        // Create the dependency
        Engine engine = new DieselEngine();
        // Inject the dependency
        return new Car(engine);
    }
}

