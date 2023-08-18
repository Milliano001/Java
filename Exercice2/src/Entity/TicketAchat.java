package Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketAchat {
    private String date;
    private int numeroTicket;
    private List<LigneAchat> lignesAchat;

    public TicketAchat(){
        lignesAchat = new ArrayList<>();
    }
    public void saisirticketachat(){
        Scanner s= new Scanner(System.in);
        System.out.print("Saisir la date du ticket : ");
        date = s.nextLine();
        System.out.print("Saisir le numéro du ticket : ");
        numeroTicket = s.nextInt();
        s.nextLine();
        System.out.print("Combien de lignes d'achat souhaitez-vous ajouter ? ");
        int nombreLignes = s.nextInt();
        s.nextLine();

        for (int i = 0; i < nombreLignes; i++) {
            System.out.println("Ligne d'achat n°" + (i + 1));
            LigneAchat ligneAchat = new LigneAchat();
            ligneAchat.saisirlignachet();
            lignesAchat.add(ligneAchat);
        }
    }
    public double calculerPrixTotalTicket() {
        double prixTotal = 0;
        for (LigneAchat ligneAchat : lignesAchat) {
            prixTotal += ligneAchat.calculerPrixTotal();
        }
        return prixTotal;
    }

    public void afficherTicket() {
        System.out.println("Ticket n°" + numeroTicket + " - Date: " + date);
        for (LigneAchat ligneAchat : lignesAchat) {
            ligneAchat.afficherLigneAchat();
        }
        System.out.println("Prix total du ticket : " + calculerPrixTotalTicket());
    }
}
