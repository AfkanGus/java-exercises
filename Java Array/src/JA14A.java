import java.util.ArrayList;

public class JA14A {
    public static <string> void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    arrayList.add(array1[i]);
                    array1[i] = "1";
                }
            }
        }
        System.out.println(arrayList);
    }
}
