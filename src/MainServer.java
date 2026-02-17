import java.io.IOException;
import java.net.BindException;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args){
int porta= 12345;
Server server;

        try {
            server = new Server(porta);
            System.out.println("Il server è in ascolto");
            Socket socket = server.attendi();
            System.out.println("IL server è connesso al client");
        }
        catch(BindException e){
            System.out.println("La porta è occupata");
        }
        catch (IOException e) {
           e.printStackTrace();
            System.exit(1);

        }
    }

}
