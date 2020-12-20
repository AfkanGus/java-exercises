import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.println("Input 2nd integer: ");
        int secondInt = in.nextInt();

        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
    }
}
/*
 * Write a Java program that accepts two integers and then prints the sum,
 * the difference,the product, the average, the distance(the difference of the integers),
 * the minimum(smaller of the two integers)
 * Напишите программу на Java, которая принимает два целых числа от пользователя,
 * а затем печатает сумму, разницу, произведение, среднее значение, расстояние
 * (разница между целыми числами), максимум (большее из двух целых чисел), минимум
 * (меньшее из двух целых чисел)*/
