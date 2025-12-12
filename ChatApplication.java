public class ChatApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the Chat Application!");
        // Initialize chat components here

        publicChat();
        System.out.println("Chat Application is running...");

        // Start the chat application
        ChatServer server = new ChatServer();
        server.start(); 
          
    } 

    }



           
