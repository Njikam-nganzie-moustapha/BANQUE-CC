public class Compte {
    private double solde;
    private double tauxInteret;

    public Compte(double solde, double tauxInteret) {
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public double getSolde() {
        return solde;
    }

    public void bouclerCompte() {
        solde += solde * tauxInteret;
    }
}
