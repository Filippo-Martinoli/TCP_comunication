import java.io.*;
import java.net.*;

public class Server {

    private ServerSocket serverSocket;
    private Socket client;
    private DataOutputStream out;
    private DataInputStream in;

    public Server(int porta) {
        try {
            serverSocket = new ServerSocket(porta);
            System.out.println("Server avviato");
        } catch (IOException e) {
            System.out.println("Errore avvio del server");
        }
    }

    public void attendi() {
        try {
            System.out.println("In attesa del client");
            client = serverSocket.accept();

            out = new DataOutputStream(client.getOutputStream());
            in = new DataInputStream(client.getInputStream());

            System.out.println("Client non connesso");
        } catch (IOException e) {
            System.out.println("Errore accept");
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

    public void invia(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            System.out.println("Errore nell'invio");
        }
    }

    public void chiudi() {
        try {
            client.close();
            System.out.println("Connessione di chiusa");
        } catch (IOException e) {
            System.out.println("Errore nella chiusura");
        }
    }
}