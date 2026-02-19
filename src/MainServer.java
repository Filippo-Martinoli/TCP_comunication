public class MainServer {
    public static void main(String[] args) {

        Server server = new Server(12345);
        while (true) {
            server.attendi();
            String msg = "";
            while (!msg.equals("fine")) {
                msg = server.leggi();

                if (msg == null) break;
                System.out.println("Ricevuto: " + msg);
                if (!msg.equals("fine")) {
                    server.scrivi("Ricevuto: " + msg);
                }
            }

            server.chiudi();
        }
    }
}
