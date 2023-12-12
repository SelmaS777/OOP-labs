package week10.Task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage {
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission{
    String value();
}

class Admin {
    private String username;
    private int permissionLevel;

    public Admin(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}
class User {
    private String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }
}

class MessagingSystem {
    @CanSendMessage
    @RequiresPermission("admin")

    public static void sendMessage(User sender, String message) {
        System.out.println("Sending message: " + message);
        System.out.println("Sent by: " + sender.getUsername());
    }

    public static void main(String[] args) {
        User regularUser = new User("Selma");
        User adminUser = new User("Noemie");

        System.out.println("Regular user trying to send a message: ");

        try {
            sendMessage(regularUser, "Hello");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();

        System.out.println("\nAdmin trying to send a message: ");
        try {
            sendMessage(adminUser, "Some message!");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

