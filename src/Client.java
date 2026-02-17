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
            System.out.println("Errore di connessione");
        }
    }


    public void invia(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            System.out.println("Errore nell' invio");
        }
    }


    public String ricevi() {
        try {
            return in.readUTF();
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
            System.out.println("Errore chiusura");
        }
    }
}