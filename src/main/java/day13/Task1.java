package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1=new User("user1");
        User user2=new User("user2");
        User user3=new User("user3");

        user1.sendMessage(user2,"Hello my friend! ");
        user1.sendMessage(user2,"How are you?");

        user2.sendMessage(user1, "Hello! ");
        user2.sendMessage(user1, "Im good!! ");
        user2.sendMessage(user1, "and how are you? ");

        user3.sendMessage(user1, "Hello! ");
        user3.sendMessage(user1, "Im good!! ");
        user3.sendMessage(user1, "and how are you? ");

        user1.sendMessage(user3, "Hello! ");
        user1.sendMessage(user3, "Im good!! ");
        user1.sendMessage(user3, "and how are you? ");

        user3.sendMessage(user1, "Hello! ");

        MessageDataBase.showDiaolo(user1,user2);



    }
}
