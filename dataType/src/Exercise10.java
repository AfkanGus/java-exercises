import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    /*    System.out.println("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }*/
        System.out.println("Input 6 digit non-negative number: ");
        String number = in.nextLine();

        for(int i = 0; i < number.length(); i++)
        {
            System.out.print(number.charAt(i) + " ");
        }

    }
}
/*
 * Write a Java program to break an integer into a sequence of individual digits.
 * An integer is a number that can be written without a fractional component.
 * For example 12, 8, 0 and 2365 are integers, while 4.25, 57 1/2, are not
 * Test Date - Input six non- negative digits: 123456*/
