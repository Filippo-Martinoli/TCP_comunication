import java.io.*;
import java.net.Socket;
public class GestoreClient extends Thread {
    private Socket socket;

    public GestoreClient(Socket socket) {
        this.socket = socket;
    }
    public void run(){
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Client gestito in parallelo: " + socket);

            while (true) {
                String msg = in.readLine();
                if (msg == null) break;
                System.out.println("Ricevuto: " + msg);
                if (msg.equalsIgnoreCase("fine")){
                    out.println("Arrivederci");
                    break;
                }
                out.println("Ricevuto: " + msg.toUpperCase());
            }
            socket.close();
            System.out.println("Client chiuso: " + socket);
        } catch (IOException e) {
            System.out.println("Errore nel client: " + e.getMessage());
        }
    }
}
