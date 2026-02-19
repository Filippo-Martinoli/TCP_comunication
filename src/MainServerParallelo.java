import java.net.ServerSocket;
import java.net.Socket;
public class MainServerParallelo {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket (12345);
            System.out.println("Server parallelo avviato");

            while(true) {
                Socket socket = serverSocket.accept();
                System.out.println("Nuovo client connesso: " + socket);
                GestoreClient gc = new GestoreClient(socket);
                gc.start();
            }
        } catch (Exception e ) {
            System.out.println("Errore nel server parallelo: " + e.getMessage());
        }
    }
}

