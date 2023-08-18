package Entity;

public class Disque extends Forme2D{
    private double rayon;
    public Disque(double rayon, String couleur){
        this.couleur=couleur;
        this.rayon=rayon;
    }

    public double getrayon(){
        return rayon;
    }
    public double diametre(){
       double diametre= rayon*2;
       return diametre;
    }
    public double aire(){
        double aire= rayon*rayon*3.14159;
        return aire;
    }
    public double perimetre(){
        double perimetre= rayon*2*3.14159;
        return perimetre;
    }
}
