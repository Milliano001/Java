package Entity;

public class Rectangle extends  Forme2D{
    private double Longeur;
    private double Largeur;
    public Rectangle(String couleur,double longueur,double largeur) {
        this.couleur=couleur;
        this.Largeur=largeur;
        this.Longeur=longueur;
    }
    public double getLongueur(){
        return Longeur;
    }
    public  double getLargeur(){
        return Largeur;
    }
    public double aire(){
       double aire=this.Largeur*this.Longeur;
       return aire;
    }
    public double perimetre(){
        double perimetre=(this.Largeur+this.Longeur)*2;
        return perimetre;
    }
}
