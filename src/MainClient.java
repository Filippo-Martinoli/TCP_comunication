import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Client client = new Client();
        client.connetti("localhost", 3241);

        Scanner tastiera = new Scanner(System.in);

        String msg = "";

        while (!msg.equals("fine")) {

            System.out.print("Inserisci messaggio: ");
            msg = tastiera.nextLine();

            client.invia(msg);

            if (!msg.equals("fine")) {
                String risposta = client.ricevi();
                System.out.println("Server " + risposta);
            }
        }

        client.chiudi();
    }
}
