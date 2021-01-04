import java.util.Arrays;

public class JA9 {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 23, 45,56};
        // Insert an element in 3rd position of the array (index->2, value->5)
        int Index_position = 2;
        int newValue = 5;
        System.out.println("Original Array" + Arrays.toString(array));
        for (int i = array.length - 1; i > Index_position; i--) {
            array[i] = array[i - 1];
        }
        array[Index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(array));
    }
}
/*
 * Write a Java program to insert an element
 *  (specific position) into an array.
 * */