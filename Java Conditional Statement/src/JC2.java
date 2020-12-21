import java.util.Scanner;

public class JC2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a:");
        double a = in.nextDouble();
        System.out.println("Input b: ");
        double b = in.nextDouble();
        System.out.println("Input c: ");
        double c = in.nextDouble();
        double rsl = b * b - 4.0 * a * c;
        if (rsl > 0.0) {
            double r1 = (-b + Math.pow(rsl, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(rsl, 0.5)) / (2.0 * a);
            System.out.println("The roots is " + r1 + "and"+ r2);
        }else if(rsl == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The roots is " + r1);
        }else{
            System.out.println(" The equation has no real roots");
        }
    }
}
/*
 * Write a Java program to solve quadratic equations(use
 * if, else if and else).
 * Test Date
 * Input a:1,b:5,c:1*/