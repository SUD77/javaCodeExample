package DependencyInversion.NotificationExample.WithoutDI;

public class WithoutDIClient {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, World!");
    }
}
