public class JA13B {
    public static void main(String[] args) {
        String[] myArray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < myArray.length; i++) {
            int count = 0;
            if (myArray[i] == "1") continue;
            String tmp = myArray[i];
            for (int j = 0; j < myArray.length; j++) {
                if (tmp.equals(myArray[j])) {
                    count++;
                    myArray[j] = "1";
                }
            }
            if (count > 1)
                System.out.println("D.E: " + tmp);

        }

    }
}
