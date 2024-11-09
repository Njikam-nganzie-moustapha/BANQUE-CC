import java.util.List;
import java.util.ArrayList;



public class Banque {
    private List<Client> clients;

    public Banque() {
        clients = new ArrayList<>();
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void afficherClients() {
        for (Client client : clients) {
            client.afficherClient();
            System.out.println();
        }
    }

    public void bouclerComptes() {
        for (Client client : clients) {
            client.getComptePrive().bouclerCompte();
            client.getCompteEpargne().bouclerCompte();
        }
    }

    public static void main(String[] args) {
        Compte comptePrivePedro = new Compte(1000.0, 0.01);
        Compte compteEpargnePedro = new Compte(2000.0, 0.02);
        Client pedro = new Client("Pedro", "Genève", comptePrivePedro, compteEpargnePedro);

        Compte comptePriveAlexandra = new Compte(3000.0, 0.01);
        Compte compteEpargneAlexandra = new Compte(4000.0, 0.02);
        Client alexandra = new Client("Alexandra", "Lausanne", comptePriveAlexandra, compteEpargneAlexandra);

        Banque banque = new Banque();
        banque.ajouterClient(pedro);
        banque.ajouterClient(alexandra);

        System.out.println("Avant le bouclement :");
        banque.afficherClients();

        banque.bouclerComptes();

        System.out.println("Après le bouclement :");
        banque.afficherClients();
    }
}
