public class face {
    public static void main(String[] args) {
        printstring(1, '+');
        printstring(8, '!');
        printstring(1, '+');
        printnextline();
        printstring(1, '[');
        printstring(1, '|');
        printstring(2, ' ');
        printstring(1, '0');
        printstring(2, ' ');
        printstring(1, '0');
        printstring(2, ' ');
        printstring(1, '|');
        printstring(1, '[');
        printnextline();
        printstring(1, ' ');
        printstring(1, '|');
        printstring(4, ' ');
        printstring(1, '^');
        printstring(4, ' ');
        printstring(1, '|');
        printstring(1, ' ');
        printstring(1, ' ');
        printnextline();
        printstring(1, '|');
        printstring(2, ' ');
        printstring(1, '-');
        printstring(1, '-');
        printstring(1, '-');
        printstring(2, ' ');
        printstring(1, '|');
        printnextline();
        printstring(1, '+');
        printstring(8, '-');
        printstring(1, '+');
        printnextline();

        System.out.println("+!!!!!!!!!!+");
        System.out.println("[|  0  0   |]");
        System.out.println(" |    ^    |");
        System.out.println(" |   '-'   |");
        System.out.println(" +---------+");
    }

    public static void printstring(int a, char c) {
        for (int i = 1; i <= a; i++) {
            System.out.print(c);

        }
    }

    public static void printnextline() {
        System.out.println();
    }
}
