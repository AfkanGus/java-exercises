import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the side length value");
        double val = in.nextDouble();
        System.out.println("Square: %12.2f \n "+val * val);
        System.out.println("Cube: %14.2f \n" + val*val*val);
        System.out.println("Fourth power: %6.2f \n" + Math.pow(val,4));
    }
}
/*
* Напишите программу на Java, которая читает число и отображает квадрат, куб и четвертую степень
Тестовые данные
Введите значение длины стороны: 15
* Write a Java program that reads a number and display the square, cube, and fourth power.

Test Data
Input the side length value: 15
* */