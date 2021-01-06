public class JA12 {
    public static void main(String[] args) {
        int[] my_array = {1,2,5,5,6,6,7,7};
        //Because we want to access the last element i< my.array-1
        for (int i = 0; i < my_array.length - 1; i++) {
            /*Why j=i+1:To check if one element equal the previous element */
            for (int j = i+1; j < my_array.length ; j++) {
                if(my_array[i] == my_array[j]){
                    System.out.println("Duplicate values:" + my_array[j]);
                }

            }
        }
    }
}
/*
* Write a Java program to find the duplicate values of an
array of integer values.
 */