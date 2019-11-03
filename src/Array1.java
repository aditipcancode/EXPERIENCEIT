
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers (input ends if 0): ");

        int count = 0;
        int number = -1;
        int max = 0;

        while (number != 0) {
            number = input.nextInt();

            if (number > max) {

                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }


        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }

}


