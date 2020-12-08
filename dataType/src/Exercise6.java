import java.util.Scanner;

import java.util.Scanner;

public class Exercise6 {
    //Write java program to compute body mass index
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in pounds:");
        double weight = input.nextDouble();
        System.out.println("Input height in inches");
        double inches = input.nextDouble();
        double BMI = weight * 0.4535 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");
    }
}
   /* Написать Java-программу для вычисления индекса массы тела (BMI).

        ИМТ: ИМТ определяется как масса тела, деленная на квадрат роста,
        и универсально выражается в единицах кг / м2 в результате массы в килограммах и роста в метрах.

        Тестовые данные
        Вес ввода в фунтах: 452
        Высота ввода в дюймах: 72

        The Bmi is defined as the body mass divided by square
        of the body height, and is universally expressed in units of
        kg/m2,resulting from in kilograms and height in metres.
        testDate
        Input weight in pounds:452
        Input height in inches:72
        */


