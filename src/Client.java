import java.io.*;
import java.net.*;

public class Client {

    private Socket socket;
    private DataOutputStream out;
    private DataInputStream in;

    public Client() {
    }

    public void connetti(String server, int porta) {
        try {
            socket = new Socket(server, porta);

            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());

            System.out.println("Client connesso");
        } catch (IOException e) {
            System.out.println("Errore nella connessione");
        }
    }

    public void scrivi(String msg) {
        try {
           writer.write(msg);
        } catch (IOException e) {
            System.out.println("Errore nell' invio");
        }
    }

    public String leggi() {
        try {
            reader.read(msg);
        } catch (IOException e) {
            System.out.println("Errore nella ricezione");
            return null;
        }
    }

    public void chiudi() {
        try {
            socket.close();
            System.out.println("Client chiuso");
        } catch (IOException e) {
            System.out.println("Errore di chiusura");
        }
    }
}
