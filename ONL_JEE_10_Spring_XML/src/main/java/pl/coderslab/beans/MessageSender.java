package pl.coderslab.beans;

public class MessageSender {
    private MessageService messageService;
    private String message;

    public MessageSender(MessageService messageService, String message) {
        this.messageService = messageService;
        this.message = message;
    }

    public void sendMessage() {
        messageService.send();
    }

    public void sendMessageFromProperty(){
        messageService.send(message);
    }
}
