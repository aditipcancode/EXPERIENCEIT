import java.util.Arrays;

public class StringEx1 {
    public static void main(String[] args) {


        String[] names = {"A", "B", "C", "D", "E", "F", "G"};
        int[] age = {10, 32, 43, 54, 65, 76, 87, 98, 19, 80};

        for (int i = 0; i <names.length; i++) {

            System.out.println(names[i]);
        }
        for (int j = 0; j < age.length; j++) {

            System.out.println(age[j]);
        }
        /*for (int element: age) {
            System.out.println(element);

        }
        for (String element: names) {
            System.out.println(element);

        }*/
    }
}
