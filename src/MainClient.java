public class MainClient {
    public static void main(String[] args) {
        Client client = new Client();
        int esito = client.connetti("localhost", 12345);

        if (esito == 0) {

            client.scrivi("Richiesta dal client");
            client.leggi();
            client.chiudi();

        } else {

            System.out.println("Server non disponibile");
        }
    }
}
