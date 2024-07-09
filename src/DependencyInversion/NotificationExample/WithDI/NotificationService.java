package DependencyInversion.NotificationExample.WithDI;

// High-level module
public class NotificationService {

    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification(String message) {
        messageService.sendMessage(message);
    }
}
