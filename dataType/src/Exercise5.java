import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise5 {
/*
    Напишите программу на Java, которая печатает текущее время
    в GMT.Тестовые данные
    Введите смещение часового пояса в GMT: 256
*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT:");
        long timeZoneChange = input.nextInt();
        long totalMillisecond = System.currentTimeMillis();
        long totalSecond = totalMillisecond /100;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond /60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" +
                currentMinute + ": " + currentSecond);


    }
}
