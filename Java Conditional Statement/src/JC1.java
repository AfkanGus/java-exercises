import java.util.Scanner;

public class JC1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = in.nextInt();
        if (input > 0) {
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
/*
 * Write a Java program to test a number is positive or negative
 * Test Data
 * Input number: 35*/