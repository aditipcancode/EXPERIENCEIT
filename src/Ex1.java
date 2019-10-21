public class Ex1 {
    public static void main(String[] args) {
        float returnedBalance = acc(100);
        System.out.println(returnedBalance);
        returnedBalance = acc(50);
        System.out.println(returnedBalance);
    }

    public static float acc(float bankaccount) {
        float interest;
        float newbalance = 0;
        if (bankaccount >= 75) {
            interest = (10 * bankaccount) / 100;
            newbalance = interest + bankaccount;
        } else {
            interest = (5 * bankaccount) / 100;
            newbalance = interest + bankaccount;
        }
        return newbalance;
    }

}

