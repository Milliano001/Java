import Entity.Equation2d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        Equation2d e=new Equation2d(10,24,5);
        Equation2d v=new Equation2d(2,4,2);
        System.out.println("Equation1: "+e.solution());
        System.out.println("Equation2: "+v.solution());
    }
}