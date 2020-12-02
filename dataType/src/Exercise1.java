import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = ((5*(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to" + celsius +" in Celsius");
    }

}
   /* Напишите программу на Java для преобразования температуры
      из Фаренгейта(fahrenheit) в градусы Цельсия(celsius).
      С =(5(А-32))/9;
      F = 9C+(32*5))/5;
      */