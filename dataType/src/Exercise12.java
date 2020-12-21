public class Exercise12 {
    //Sample Solution:
    public static void main(String[] args) {
        int in1 = Integer.MIN_VALUE;
        int in2 = Integer.MAX_VALUE;
        System.out.println("Signed integer: " + in1 + " , " +  in2);
        System.out.println("--------------");
        int compare_Signed_num = Integer.compare(in1, in2);
        System.out.println(" Result of comparing signed numbers: " + compare_Signed_num);
        int compare_Unsigned_num = Integer.compareUnsigned(in1, in2);
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
    }
}
/*
* Write a Java program to compare two given signed and unsigned numbers.
* Напишите программу на Java для сравнения двух заданных чисел со знаком и без знака.*/
