import java.util.Arrays;

public class JA12A {
    public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 7};

        for (int i = 0; i < my_array.length; i++) {
            if (my_array[0] == my_array[i]) {
                System.out.println("D.E" + i + "Element of = " + my_array[i]);
            }

        }
    }
}

