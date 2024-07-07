package DependencyInjection.WithoutDI;

public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel engine starting...");
    }
}
