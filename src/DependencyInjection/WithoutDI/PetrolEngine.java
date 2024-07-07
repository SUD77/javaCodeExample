package DependencyInjection.WithoutDI;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol engine starting...");
    }
}
