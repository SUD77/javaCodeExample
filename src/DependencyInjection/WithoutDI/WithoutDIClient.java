package DependencyInjection.WithoutDI;

public class WithoutDIClient {
    public static void main(String[] args) {
        // Create the car
        Car car = new Car();
        // Start the car
        car.startCar();

        // Switch to a diesel engine for testing purposes
        car.switchToDieselEngine();
        car.startCar();
    }
}
