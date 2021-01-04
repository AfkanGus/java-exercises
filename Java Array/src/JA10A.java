public class JA10A {
    public static void main(String[] args) {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max = my_array[0];
        int min = my_array[0];
        for(int a:my_array){
            if(a<min){
                min = a;
            }
            if(a>max){
                max = a;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
