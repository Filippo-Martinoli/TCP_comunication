import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private String nome;
    private String colore;
    private Socket socket;

    public Client() {
        this.nome = nome;
    }

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public Client(String filippo) {
    }

    public int connetti (String nomeServer, int portaServer)  {
        try {
            socket = new Socket(nomeServer, portaServer);
            System.out.println("CLIENT: il client è collegato al server ");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        return portaServer;
    }
    public void scrivi(){
try{
    OutputStream outputStream = socket.getOutputStream();
    PrintWriter writer = new PrintWriter(outputStream);
    writer.


}
    }
    public void leggi(){
        InputStream inputStream = clientSocket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            return in.readline();

        }

    }
    public void chiudi(){

    }
}
