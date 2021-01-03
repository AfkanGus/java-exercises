public class JA5 {
    /*
     * Write a java program to test if an array
     *  contains a specific value*/

    public static boolean contains(int[] arr, int item) {
        for (int s: arr) {
            if (item == s)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }
}
