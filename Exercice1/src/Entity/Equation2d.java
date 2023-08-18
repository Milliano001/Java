package Entity;
public class Equation2d {
    private int a;
    private int b;
    private int c;

    public Equation2d(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Equation2d(Equation2d equation) {
        this.a = equation.a;
        this.b = equation.b;
        this.c = equation.c;
    }

    public String solution() {
        int discriminant = (b * b) - 4 * a * c;
        if (discriminant > 0) {
            int x1 = (int) ((-b + Math.sqrt(discriminant)) / (2 * a));
            int x2 = (int) (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Le discriminant est supérieur à zéro. Cette équation a deux solutions qui sont " + x1 + " et " + x2;
        } else if (discriminant == 0) {
            int x = -b / (2 * a);
            return "Le discriminant est égal à zéro. Cette équation a une solution qui est " + x;
        } else {
            return "Le discriminant est inférieur à zéro.Aucune solution";
        }
    }
}
