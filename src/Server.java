import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private int porta;

    public Server(int porta) throws IOException {
        this.porta = this.porta;
        this.serverSocket = serverSocket;
        serverSocket = new ServerSocket(porta);

    }
    public Socket attendi(){
        try {
            socket = serverSocket.accept();
        } catch (IOException e) {
            // il server non riesci ad accettare la connessione con il client
        }
        return socket;
    }
    public void scrivi(){

    }
    public void leggi(){

    }
    public void chiudi(){

    }
    public void termina(){

    }
}
