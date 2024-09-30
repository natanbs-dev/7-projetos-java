package projeto1;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Projeto_02 {

    public static void main(String[] args) {
        int[] array1 = {
                1784, 2321, 3213, 3213, 3213,
                3123, 7467, 4367, 5435, 7653,
                7476, 7584, 6543, 5454};

        String[] array2 = {
            "Java", "Python", "C#", "C++", "Programming", "PHP"
        };
        Arrays.sort(array1);

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

//        System.out.println(Arrays.toString(array1));
    }
}
