package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User reciver, String text) {
        messages.add(new Message(sender, reciver, text));
    }

    public static void showDiaolo(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReciver() == u2
                    || message.getSender() == u2 && message.getReciver() == u1) {
                System.out.println(message.getSender()+": "+message.getText());
            }
            }
        }
    }
