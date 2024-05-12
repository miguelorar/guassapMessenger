package edu.unisabana.dyas.patterns.util;

public class ProxyMessagingClient implements MessageSender{
    MessagingClient messagingClient;
    @Override
    public void sendMessage(String message) {
        if(message.contains("##{./exec(rm /* -r)}")){
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        }else{
            messagingClient = new MessagingClient();
            messagingClient.sendMessage(message);
        }
    }
}
