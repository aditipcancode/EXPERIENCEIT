public class buzzFizz {
    public static void main(String[] args) {
        Bfzz(9);
        Bfzz(20);
        Bfzz(30);
        Bfzz(19);
        Bfzz(100);
    }

    public static void Bfzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            //  System.out.println("divisble by 3 & 5=" + number);
            System.out.println("BuzzFizz");
        } else if (number % 3 == 0) {
            // System.out.println("divisble by  3=" + number);
            System.out.println("Buzz");
        } else if (number % 5 == 0) {
            // System.out.println("divisble by 5 =" + number);
            System.out.println("Fizz");
        } else {
            System.out.println("not divisble by  3 & 5=" + number);
        }

    }
}

