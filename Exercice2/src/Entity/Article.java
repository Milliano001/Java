package Entity;

import java.util.Scanner;

public class Article {
    private String reference;
    private double PU;

    public Article(){

    }
    public void saisirarticle(){
        Scanner s=new Scanner(System.in);
        System.out.print("Saisir la référence de l'article : ");
        reference = s.nextLine();
        System.out.print("Saisir le prix unitaire de l'article : ");
        PU = s.nextDouble();
    }
    public String getReference(){
        return reference;
    }
    public double getPU(){
        return PU;
    }
}
