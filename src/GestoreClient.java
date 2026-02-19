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
                String richiesta = in.readLine();
                if (richiesta == null) break;
                System.out.println("Ricevuto: " + richiesta);
                if (richiesta.equalsIgnoreCase("fine")){
                    out.println("Arrivederci");
                    break;
                }
                out.println("Ricevuto: " + richiesta.toUpperCase());
            }
            socket.close();
            System.out.println("Client chiuso: " + socket);
        } catch (IOException e) {
            System.out.println("Errore nel client: " + e.getMessage());
        }
    }
}
