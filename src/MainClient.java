import java.util.Scanner;

public class MainClient {

    public static void main(String[] args) {

        Client client = new Client();
        client.connetti("localhost", 12345);

        Scanner tastiera = new Scanner(System.in);

        String msg = "";

        while (!msg.equals("fine")) {

            System.out.print("Inserisci messaggio: ");
            msg = tastiera.nextLine();

            client.scrivi(msg);

            if (!msg.equals("fine")) {
                String risposta = client.leggi();
                System.out.println("Server " + risposta);
            }
        }

        client.chiudi();
    }
}
