import java.util.ArrayList;
        import java.util.Scanner;

public class OCCURENCE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = -1;
        int occurrence = 0;
        int inputnumber;
        ArrayList<Integer> al = new ArrayList<Integer>();

        System.out.print("Enter number: ");
        do {
            al.add(input.nextInt());
            inputnumber = input.nextInt();
        } while (inputnumber != 0);
        for (int number = 0; number <= al.size(); number++) {
            if (number > largest) {
                occurrence = 0;
                largest = number;
            }
            if (number == largest) {
                occurrence++;
            }
        }

        System.out.println("The largest number is " + largest);
        System.out.println("The occurrence count is " + occurrence);
    }
}
