public class JA13A {
    public static void main(String[] args) {
        String[] names = {"Jack", "Kite", "Kite", "Jack", "Pam"};

        compare(names);
    }

    public static boolean compare(String[] arr) {
        boolean duplicates = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    System.out.println("E.D : " + arr[i]);
                    duplicates = true;
                }
            }
        }
        return duplicates;
    }
}
