import Entity.TicketAchat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TicketAchat t=new TicketAchat();

        System.out.println("Saisie des informations pour le ticket de caisse :");
        t.saisirticketachat();

        System.out.println("\nDétails du ticket de caisse :");
        t.afficherTicket();
    }
}