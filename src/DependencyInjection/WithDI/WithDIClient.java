package DependencyInjection.WithDI;

public class WithDIClient {
    public static void main(String[] args) {
        // Use the injector to create the car with a petrol engine
        Car petrolCar = CarInjector.createPetrolCar();
        // Start the car
        petrolCar.startCar();

        // Use the injector to create the car with a diesel engine
        Car dieselCar = CarInjector.createDieselCar();
        // Start the car
        dieselCar.startCar();
    }
}
