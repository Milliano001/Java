package Entity;

import java.util.Scanner;

public class LigneAchat {
    private Article article;
    private int quantite;

    public LigneAchat() {
        article = new Article(); // Créer un nouvel objet Article avant d'utiliser les méthodes
    }

    public void saisirlignachet() {
        Scanner s = new Scanner(System.in);
        article.saisirarticle();
        System.out.print("Entre la quantité : ");
        quantite = s.nextInt();
    }

    public double calculerPrixTotal() {
        return article.getPU() * quantite;
    }

    public void afficherLigneAchat() {
        System.out.println("Article - Référence: " + article.getReference() + ", Prix unitaire: " + article.getPU() + " avec une quantité de " + quantite+
                ".Le prix total est :"+article.getPU()*quantite);
    }
}
