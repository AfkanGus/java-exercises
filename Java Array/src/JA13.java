public class JA13 {
    public static void main(String[] args) {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        for (int i = 0; i < my_array.length - 1; i++) {
            for (int j = 0; j < my_array.length; j++) {
                if(my_array[i].equals(my_array[j]) && (i!=j)){
                    System.out.println("Duplicate values : " + my_array[j]);
                }
            }
        }



    }
}
/*
* Write a Java program to find the duplicate values of an
* array of string values*/