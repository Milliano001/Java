import Entity.Disque;
import Entity.Forme2D;
import Entity.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle r= new Rectangle("blanc",25,15);
        Disque d= new Disque(25,"cafe");
        System.out.println("les directive sur le rectangle");
        System.out.println("Périmetre= "+r.perimetre()+", Aire= "+r.aire());
        System.out.println("les directive sur le Disque");
        System.out.println("Périmetre= "+d.perimetre()+", Aire= "+d.aire());
    }
}