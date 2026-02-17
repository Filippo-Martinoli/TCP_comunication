public class MainServer {

    public static void main(String[] args) {
        Server server = new Server(12345);

        while (true) {
            //connessione con il client
            server.attendi(); //attesa richiesta del client
            String msg = "";
// ciclo per scambiare più messaggi
            while (!msg.equals("fine")) {
                msg = server.ricevi();
                if (msg == null) break; // se non c'è il messaggio si stoppa
                System.out.println("Ricevuto: " + msg);
                if (!msg.equals("fine")) {
                    server.invia("Ricevuto: " + msg);
                }
            }
            server.chiudi();
        }
    }
}