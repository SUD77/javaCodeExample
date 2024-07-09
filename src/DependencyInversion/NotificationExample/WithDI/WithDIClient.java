package DependencyInversion.NotificationExample.WithDI;

public class WithDIClient {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.sendNotification("Hello, World!");

        // Alternatively, we can use another implementation
        MessageService smsService = new SMSService();
        notificationService = new NotificationService(smsService);
        notificationService.sendNotification("Hello, World!");
    }
}
