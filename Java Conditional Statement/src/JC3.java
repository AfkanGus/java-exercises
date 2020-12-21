import java.util.Scanner;

public class JC3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 > num2)
            if (num2 > num3)
                System.out.println("The greatest: " + num1);
        if (num2 > num1)
            if (num2 > num3)
                System.out.println("The greatest: " + num2);
        if (num3 > num1)
            if (num3 > num2)
                System.out.println("The greatest: " + num3);
    }
}
/*
* Take three numbers from the user and print the greatest number
* Test Date
* Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
*/
