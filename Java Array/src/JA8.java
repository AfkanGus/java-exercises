import java.util.Arrays;

public class JA8 {
    public static void main(String[] args) {
        int[] my_array = {25, 24, 56, 14};
        int[] new_array = new int[4];
        System.out.println("Source Array : " + Arrays.toString(my_array));
        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New Array : " + Arrays.toString(new_array));
    }
}
/*Write a Java program to copy an array by iterating the array.

 */