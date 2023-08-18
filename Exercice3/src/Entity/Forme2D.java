package Entity;

public class Forme2D {
    protected String couleur;

    public Forme2D() {
        this.couleur = "noire";
    }

    public Forme2D(String couleur) {
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public double aire() {
        return 0;
    }

    public double perimetre() {
        return 0;
    }
}

