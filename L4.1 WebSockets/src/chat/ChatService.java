package chat;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * chat service
 */
class ChatService {
    private Set<ChatWebSocket> webSockets;

    ChatService() {
        this.webSockets = Collections.newSetFromMap(new ConcurrentHashMap<>());
    }

    void sendMessage(String data) {
        for (ChatWebSocket user : webSockets) {
            try {
                user.sendString(data);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    void add(ChatWebSocket webSocket) {
        webSockets.add(webSocket);
    }

    void remove(ChatWebSocket webSocket) {
        webSockets.remove(webSocket);
    }

}
