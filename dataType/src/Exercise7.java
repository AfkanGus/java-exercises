import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float timeSeconds;
        float mps,kph,mph;
        System.out.print("Input distance in meters:");
        float distance = scanner.nextFloat();

        System.out.print(" Input hour:");
        float hr = scanner.nextFloat();

        System.out.println("Input minutes:" );
        float min = scanner.nextFloat();

        System.out.print("Input seconds");
        float sec = scanner.nextFloat();

        timeSeconds = (hr*3600)+(min*60)+sec;
        mps = distance / timeSeconds;
        kph = (distance/1000.0f)/(timeSeconds/3600.0f);
        mph = kph / 1.609f;
        System.out.println("Your speed in meters/second is:" + mps);
        System.out.println("Your speed in km/h is:"+kph);
        System.out.println("Your speed in miles/h is:" + mph);
        scanner.close();
    }
}
/*
* Write a Java program to display the speed,in meters per second,
* kilometers per hour and miles per hour
* User Input: Distance(in meters) and the time
* was taken(as three numbers:hours, minutes,second).
* Note: 1 mile = 1609 meters
* Test Date
* Input distance in meters 2500
* Input hour: 5
* Input minutes:56
* Input seconds:23
* */