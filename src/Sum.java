public class Sum {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int [] values={5,10};
        System.out.println(a);
        System.out.println(b);
        System.out.println(Add(a,b));
        System.out.println(a);
        System.out.println(b);


        System.out.println("value 0 before increment"+"="+values[0]);
        System.out.println("value 1 before increment"+"="+values[1]);
        System.out.println(Add(values));
        System.out.println("value 0 after increment"+"="+values[0]);
        System.out.println("value 1 after increment"+"="+values[1]);


    }

    public static int Add(int a, int b) {
        a++;
        b++;
        int sum = a + b;
        return sum;
    }

    public static int Add(int [] values) {
        values[0]++;
        values[1]++;
        int sum = values[0]+values[1];
        return sum;
    }

}
