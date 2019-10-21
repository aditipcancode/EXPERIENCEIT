public class NumberExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            {
                if (i >= 5)
                    System.out.println(i);
            }
            i++;
        } while (i >= 10);

        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }
}
