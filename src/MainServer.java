public class MainServer {
    public static void main(String[] args) {

        Server server = new Server(3241);
        while (true) {
            server.attendi();
            String msg = "";
            while (!msg.equals("fine")) {
                msg = server.ricevi();

                if (msg == null) break;
                System.out.println("Ricevuto: " + msg);
                if (!msg.equals("fine")) {
                    server.invia("Ricevuto: " + msg);
                }
            }

            server.chiudi();
        }
    }
}
