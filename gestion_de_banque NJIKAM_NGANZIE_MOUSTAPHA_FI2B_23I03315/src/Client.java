public class Client {
    private String nom;
    private String ville;
    private Compte comptePrive;
    private Compte compteEpargne;

    public Client(String nom, String ville, Compte comptePrive, Compte compteEpargne) {
        this.nom = nom;
        this.ville = ville;
        this.comptePrive = comptePrive;
        this.compteEpargne = compteEpargne;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public Compte getComptePrive() {
        return comptePrive;
    }

    public Compte getCompteEpargne() {
        return compteEpargne;
    }

    public void afficherClient() {
        System.out.println("Client " + nom + " de " + ville);
        System.out.println("Compte privé : " + comptePrive.getSolde() + " francs");
        System.out.println("Compte d'épargne : " + compteEpargne.getSolde() + " francs");
    }
}
