import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("how many numbers you want to put" + "=");
        Scanner scanner = new Scanner(System.in);
        int n1= scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);
        double[] numbers = new double[n1];
        double sum = 0;
        int i = 0;



        /*int[] numbers = {10, 20, 30, 40, 50};
        //for (int i = 0; i < numbers.length; i++)
           // System.out.println("Element at index " + i + " : " + numbers[i]);
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        double Avg = sum / numbers.length;
        System.out.println("Average of all the number is " + " = " + Avg);*/


        for (i = 0; i < numbers.length; i++) {
            System.out.println("enter a number");
            numbers[i] = scanner1.nextDouble();
            sum = sum + numbers[i];
            // System.out.println(sum);
        }
        double Avg = sum / numbers.length;
        System.out.println("Average of number is" + "  = " + Avg);
    }
}