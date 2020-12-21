import java.util.Scanner;

public class Exercise4 {
    /*Напишите программу на Java для преобразования минут в количество лет и дней.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minutsInYear = 60 * 24 * 365;
        System.out.println("input the number of minutes: ");
        double min = input.nextDouble();
        long years = (long)(min / minutsInYear);
        int days  = (int)(min/60/24)/365;
        System.out.println((int)min + "minutes is appoximately" + years  + " years" + days + " days" );
    }
}

