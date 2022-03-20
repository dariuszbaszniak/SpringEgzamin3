package pl.coderslab.beans;

public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;

    }

    public String getMessages() {
        return message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setMessages(String message) {
        this.message = message;
    }
}
