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
            System.out.println("Errore avvio server");
        }
    }
    public void attendi() {
        try {
            System.out.println("In attesa client...");
            client = serverSocket.accept();
            out = new DataOutputStream(client.getOutputStream());
            in = new DataInputStream(client.getInputStream());
            System.out.println("Client connesso");
        } catch (IOException e) {
            System.out.println("Errore accept");
        }
    }
    public String leggi() {
        try {
           return in.readUTF();
        } catch (IOException e) {
            System.out.println("Errore nella ricezione");
            return null;
        }
    }
    public void scrivi(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            System.out.println("Errore invio");
        }
    }
    public void chiudi() {
        try {
            client.close();
            System.out.println("Connessione chiusa");
        } catch (IOException e) {
            System.out.println("Errore nella chiusura");
        }
    }
}
